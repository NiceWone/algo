package yandex

fun main() {
    val (firstMatchFirstTeamScore, firstMatchSecondTeamScore) = readln().split(':').map { it.toInt() }
    val (secondMatchFirstTeamScore, secondMatchSecondTeamScore) = readln().split(':').map { it.toInt() }
    val previousMatch = readln().toInt()

    val firstTeamScore = firstMatchFirstTeamScore + secondMatchFirstTeamScore
    val secondTeamScore = firstMatchSecondTeamScore + secondMatchSecondTeamScore
    val count = if (firstTeamScore > secondTeamScore) {
        0
    } else if (firstTeamScore == secondTeamScore) {
        if (previousMatch == 1) {
            if (firstMatchSecondTeamScore >= secondMatchFirstTeamScore) {
                1
            } else {
                0
            }
        } else {
            if (firstMatchFirstTeamScore > secondMatchSecondTeamScore) {
                0
            } else {
                1
            }
        }
    } else {
        val paritet = secondTeamScore - firstTeamScore
        if (previousMatch == 1) {
            if (firstMatchSecondTeamScore > secondMatchFirstTeamScore + paritet) {
                paritet + 1
            } else {
                paritet
            }
        } else {
            if (firstMatchFirstTeamScore > secondMatchSecondTeamScore) {
                paritet
            } else {
                paritet + 1
            }
        }
    }
    println(count)
}

