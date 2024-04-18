package rbpnb

fun main() {
    val purpose = "adasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasdadasddsaasd"
    val purposeDetails = PurposeDetails(
//        direction = purpose.doSame(0,13)?.trim(),
        direction = purpose[0..13]?.trim(),
        payeePhoneNumber = purpose[15..24]?.trim(),
        nspk = purpose[108..139]?.trim(),
        message = purpose[141..192]?.trim(),
        transferCode = purpose[193..199]?.trim(),
        transgranMark = purpose[200..200]
    )
    println(purposeDetails)
}

fun String.doSame(start: Int, end: Int):String? {
    if (this.length <= end)
        return null

    return substring(start..end)
}
operator fun String.get(range: IntRange): String? {
    if (length <= range.last)
        return null

    return substring(range)
}

data class PurposeDetails(
    val direction: String?,
    val payeePhoneNumber: String?,
    val nspk: String?,
    val message: String?,
    val transferCode: String?,
    val transgranMark: String?
)
