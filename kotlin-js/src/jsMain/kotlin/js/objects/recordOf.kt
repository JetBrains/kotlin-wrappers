package js.objects

fun <K : Any, V> recordOf(
    vararg pairs: Pair<K, V>,
): Record<K, V> {
    val record = Record<K, V>()

    for ((key, value) in pairs) {
        record[key] = value
    }

    return record
}
