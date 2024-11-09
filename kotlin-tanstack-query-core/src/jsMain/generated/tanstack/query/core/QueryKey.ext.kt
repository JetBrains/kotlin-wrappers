// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.query.core

import js.array.ReadonlyArray
import js.reflect.unsafeCast

inline fun <T : QueryKey> QueryKey(
    vararg keys: Comparable<*>,
): T =
    unsafeCast(keys)

fun <T : QueryKey> QueryKey(
    parentKey: QueryKey,
    vararg keys: Comparable<*>,
): T =
    unsafeCast(unsafeCast<ReadonlyArray<*>>(parentKey) + keys)
