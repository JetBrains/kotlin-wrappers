// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.query.core

import kotlinx.js.ReadonlyArray

inline fun <T : QueryKey> QueryKey(
    vararg keys: Comparable<*>,
): T =
    keys.unsafeCast<T>()

fun <T : QueryKey> QueryKey(
    parentKey: QueryKey,
    vararg keys: Comparable<*>,
): T =
    (parentKey.unsafeCast<ReadonlyArray<*>>() + keys).unsafeCast<T>()
