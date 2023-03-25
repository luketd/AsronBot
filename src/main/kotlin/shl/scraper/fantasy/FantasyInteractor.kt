package shl.scraper.fantasy

object FantasyInteractor {
    fun getCategoryStandings(cacheOnly: Boolean = true): FantasyResponse<List<FantasyCategoryStandings>> {
        return FantasyResponse(GoogleSheetsFantasyRepository.getCategoryStandings(cacheOnly))
    }

    fun getGlobal(cacheOnly: Boolean = true): FantasyResponse<List<FantasyTeam>> {
        val index = LeagueIndexFantasyRepository.getGlobal(cacheOnly)
        return FantasyResponse(index)
    }

    fun getGroup(userName: String): FantasyResponse<FantasyGroup>? {
        val sheet = GoogleSheetsFantasyRepository.getGroup(userName) ?: return null
        val index = LeagueIndexFantasyRepository.getGroup(sheet.number) ?: return FantasyResponse(sheet)
        return FantasyResponse(index)
    }

    fun getGroup(number: Int, cacheOnly: Boolean = true): FantasyResponse<FantasyGroup>? {
        val sheet = GoogleSheetsFantasyRepository.getGroup(number, cacheOnly) ?: return null
        val index = LeagueIndexFantasyRepository.getGroup(number, cacheOnly) ?: return FantasyResponse(sheet)
        return FantasyResponse(index)
    }

    fun getRoster(groupNumber: Int, teamName: String?, cacheOnly: Boolean = true): FantasyResponse<FantasyRoster>? {
        val sheet = GoogleSheetsFantasyRepository.getRoster(groupNumber, teamName, cacheOnly) ?: return null
        val index = LeagueIndexFantasyRepository.getRoster(groupNumber, teamName, cacheOnly)
            ?: return FantasyResponse(sheet)
        return FantasyResponse(index)
    }
}