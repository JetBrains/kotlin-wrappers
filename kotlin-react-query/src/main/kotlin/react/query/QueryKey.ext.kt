@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.query

inline fun <T : QueryKey> QueryKey(
    key: String,
): QueryKey = key

inline fun <T : QueryKey> QueryKey(
    vararg keys: Any,
): QueryKey = keys
