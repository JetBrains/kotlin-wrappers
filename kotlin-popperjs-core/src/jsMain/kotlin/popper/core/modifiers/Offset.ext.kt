@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import js.array.JsTuple2
import js.array.tupleOf
import js.reflect.unsafeCast

inline fun Offset(
    x: Double?,
    y: Double?,
): OffsetType =
    unsafeCast(tupleOf(x, y))

inline fun OffsetFunction(
    noinline fn: Provider<JsTuple2<Int?, Int?>>,
): OffsetType =
    unsafeCast(fn)
