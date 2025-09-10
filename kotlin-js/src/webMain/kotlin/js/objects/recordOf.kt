package js.objects

import kotlin.js.JsAny

fun <K : JsAny, V : JsAny?> recordOf(
    vararg pairs: Pair<K, V>,
): Record<K, V> {
    val record = Record<K, V>()

    for ((key, value) in pairs) {
        record[key] = value
    }

    return record
}
