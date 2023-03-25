package shl.scraper.subscribe

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

sealed class PtDueDateType(open val date: Calendar) {
    data class Exact(override val date: Calendar) : PtDueDateType(date)

    data class SimStart(override val date: Calendar) : PtDueDateType(date)

    data class Day(override val date: Calendar) : PtDueDateType(date)
}

fun parsePtDueDate(input: String): PtDueDateType? {
    try {
        val parts = input.replace("(?i)due:?\\s*".toRegex(), "")
            .split("(?i)\\s*@\\s*".toRegex())
        if (parts.isEmpty()) {
            return null
        }

        val monthAndDay = parts[0].split("\\s+".toRegex())
        val month = SimpleDateFormat("MMMM").parse(monthAndDay[0]).month
        val day = monthAndDay[1].replace("[^\\d.]".toRegex(), "").toInt()
        val date = Calendar.getInstance().apply {
            timeZone = TimeZone.getTimeZone("PST")

            set(Calendar.MONTH, month)
            set(Calendar.DAY_OF_MONTH, day)
            set(Calendar.MILLISECOND, 0)
            set(Calendar.SECOND, 0)

            set(Calendar.HOUR, 11)
            set(Calendar.MINUTE, 0)
            set(Calendar.AM_PM, Calendar.AM)

            if (month == Calendar.JANUARY) {
                val today = Calendar.getInstance()
                if (today.get(Calendar.MONTH) == Calendar.DECEMBER) {
                    set(Calendar.YEAR, today.get(Calendar.YEAR) + 1)
                }
            }
        }

        val time = parts.getOrNull(1)
        when {
            time == null -> {
                return PtDueDateType.Day(date)
            }
            time.contains("sim", ignoreCase = true) -> {
                return PtDueDateType.SimStart(date)
            }
            else -> {
                val timeParts = time.split("\\s+".toRegex())
                val hourPart = timeParts[0].split(":")
                val hour = hourPart[0].toInt()
                val minutes = hourPart[1].toInt()
                val isPstTimezone = time.contains("PST", ignoreCase = true)
                val isPM = !timeParts[1].contains("AM", ignoreCase = true)

                date.apply {
                    set(Calendar.HOUR, if (hour == 12) 0 else hour)
                    set(Calendar.MINUTE, minutes)
                    set(Calendar.AM_PM, if (isPM) Calendar.PM else Calendar.AM)
                    timeZone = TimeZone.getTimeZone(if (isPstTimezone) "PST" else "EST")
                }

                return PtDueDateType.Exact(date)
            }
        }
    } catch (e: Exception) {
        return null
    }
}