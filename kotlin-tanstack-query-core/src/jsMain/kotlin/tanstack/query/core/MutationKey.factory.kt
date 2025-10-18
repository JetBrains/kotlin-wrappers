package tanstack.query.core

import js.array.ReadonlyArray
import js.reflect.unsafeCast

inline fun <T : MutationKey> MutationKey(
    vararg keys: Comparable<*>,
): T =
    unsafeCast(keys)

fun <T : MutationKey> MutationKey(
    parentKey: MutationKey,
    vararg keys: Comparable<*>,
): T =
    unsafeCast(unsafeCast<ReadonlyArray<*>>(parentKey) + keys)
