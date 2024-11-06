@file:Suppress(
    "NOTHING_TO_INLINE",
)

package popper.core.modifiers

import js.reflect.unsafeCast

inline fun TetherOffset(
    x: Double,
): TetherOffsetType =
    unsafeCast(x)

inline fun TetherOffsetFunction(
    noinline fn: Provider<Double>,
): TetherOffsetType =
    unsafeCast(fn)
