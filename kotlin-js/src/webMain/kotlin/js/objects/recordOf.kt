package js.objects

/**
 * [Online Documentation](https://www.typescriptlang.org/docs/handbook/utility-types.html#recordkeys-type)
 */
fun <K : JsAny, V : JsAny?> recordOf(): Record<K, V> =
    unsafeJso()

/**
 * [Online Documentation](https://www.typescriptlang.org/docs/handbook/utility-types.html#recordkeys-type)
 */
fun <K : JsAny, V : JsAny?> recordOf(
    vararg pairs: Pair<K, V>,
): Record<K, V> =
    buildRecord {
        for ([key, value] in pairs) {
            set(key, value)
        }
    }
