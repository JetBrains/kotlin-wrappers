package karakum.cesium

internal fun String.count(
    substring: String,
): Int {
    var index = 0
    var count = 0

    do {
        index = indexOf(substring, index)
        if (index == -1) break

        index += substring.length
        count++
    } while (true)

    return count
}
