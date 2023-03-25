package shl.scraper.roster

class TeamGm(
    val name: String,
    relProfilePath: String
) {
    val fullProfilePath = "http://simulationhockey.com/$relProfilePath"
}