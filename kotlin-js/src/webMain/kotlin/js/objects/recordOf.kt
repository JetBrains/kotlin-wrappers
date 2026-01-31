package js.objects

import kotlin.js.JsAny

fun <K : JsAny, V : JsAny?> recordOf(
    vararg pairs: Pair<K, V>,
): Record<K, V> =
    buildRecord {
        for ((key, value) in pairs) {
            set(key, value)
        }
    }
