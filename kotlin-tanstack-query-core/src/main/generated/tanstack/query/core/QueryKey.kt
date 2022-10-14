// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.query.core

inline fun <T : QueryKey> QueryKey(
    vararg keys: Comparable<*>,
): T =
    keys.unsafeCast<T>()

inline fun <T : QueryKey> QueryKey(
    parentKey: QueryKey,
    vararg keys: Comparable<*>,
): T =
    (parentKey.unsafeCast<Array<*>>() + keys).unsafeCast<T>()
