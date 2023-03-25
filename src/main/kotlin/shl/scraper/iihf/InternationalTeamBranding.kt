package shl.scraper.iihf

enum class InternationalTeamBranding(
    val emoji: String,
    val color: String,
    val nameRegex: Regex
) {
    Sweden(
        emoji = "\uD83C\uDDF8\uD83C\uDDEA",
        color = "#004B87",
        nameRegex = "(?i)sweden|swe".toRegex()
    ),
    Finland(
        emoji = "\uD83C\uDDEB\uD83C\uDDEE",
        color = "#002F6C",
        nameRegex = "(?i)finland|fin".toRegex()
    ),
    Canada(
        emoji = "\uD83C\uDDE8\uD83C\uDDE6",
        color = "#EF3340",
        nameRegex = "(?i)canada|can".toRegex()
    ),
    Norway(
        emoji = "\uD83C\uDDF3\uD83C\uDDF4",
        color = "#BA0C2F",
        nameRegex = "(?i)norway|nor".toRegex()
    ),
    Great_Britain(
        emoji = "\uD83C\uDDEC\uD83C\uDDE7",
        color = "#012169",
        nameRegex = "(?i)(great britain)|gbr".toRegex()
    ),
    Japan(
        emoji = "\uD83C\uDDEF\uD83C\uDDF5",
        color = "#EF3340",
        nameRegex = "(?i)japan|jpn".toRegex()
    ),
    Russia(
        emoji = "\uD83C\uDDF7\uD83C\uDDFA",
        color = "#0072CE",
        nameRegex = "(?i)russia|rus".toRegex()
    ),
    Czechia(
        emoji = "\uD83C\uDDE8\uD83C\uDDFF",
        color = "#003087",
        nameRegex = "(?i)czechia|czh".toRegex()
    ),
    Switzerland(
        emoji = "\uD83C\uDDE8\uD83C\uDDED",
        color = "#DA291C",
        nameRegex = "(?i)switzerland|swi".toRegex()
    ),
    United_States(
        emoji = "\uD83C\uDDFA\uD83C\uDDF8",
        color = "#BF0D3E",
        nameRegex = "(?i)(united states)|usa|us".toRegex()
    ),
    Ireland(
        emoji = "\uD83C\uDDEE\uD83C\uDDEA",
        color = "#169B62",
        nameRegex = "(?i)ireland|ire|irl".toRegex()
    ),
    Germany(
        emoji = "\uD83C\uDDE9\uD83C\uDDEA",
        color = "#000000",
        nameRegex = "(?i)germany|ger".toRegex()
    ),
    Latvia(
        emoji = "\uD83C\uDDF1\uD83C\uDDFB",
        color = "#A4343A",
        nameRegex = "(?i)Latvia|lat|ltv".toRegex()
    ),
    Austria(
        emoji = "\uD83C\uDDE6\uD83C\uDDF9",
        color = "#EF3340",
        nameRegex = "(?i)Austria|aut".toRegex()
    );

    companion object {
        fun findBranding(teamName: String): InternationalTeamBranding? {
            return values().find {
                it.nameRegex.matches(teamName)
            }
        }
    }
}