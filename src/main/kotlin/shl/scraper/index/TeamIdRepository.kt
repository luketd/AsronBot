package shl.scraper.index

import shl.scraper.index.api.IndexApiClient
import shl.scraper.index.api.TeamInfoResponse
import shl.scraper.roster.TeamInfo

object TeamIdRepository {
    fun requireFhmTeamId(teamInfo: TeamInfo): Int {
        return IndexApiClient.get(teamInfo).getTeamInfos().find {
            it.name == teamInfo.fullName
        }?.id ?: throw IllegalArgumentException("Couldn't resolve team id")
    }

    fun requireTeamInfoForFhmId(teamInfoResponse: TeamInfoResponse): TeamInfo {
        if (teamInfoResponse.league == LeagueType.IIHF.apiId) {
            return TeamInfo.IIHF_TEAM
        } else if (teamInfoResponse.league == LeagueType.WJC.apiId) {
            return TeamInfo.WJC_TEAM
        }

        return TeamInfo.values().filter { it.leagueType.apiId == teamInfoResponse.league }.find {
            requireFhmTeamId(it) == teamInfoResponse.id
        } ?: throw IllegalArgumentException()
    }
}