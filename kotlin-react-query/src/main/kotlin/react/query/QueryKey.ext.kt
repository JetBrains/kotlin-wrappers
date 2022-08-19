@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.query

inline fun <T : QueryKey> QueryKey(
    key: String,
): T = key.unsafeCast<T>()

inline fun <T : QueryKey> QueryKey(
    vararg keys: Any,
): T = keys.unsafeCast<T>()
