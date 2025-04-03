package popper.core.modifiers

import js.reflect.unsafeCast
import js.reflect.legacyUnsafeCast

inline fun TetherOffset(
    x: Double,
): TetherOffsetType =
    unsafeCast(x)

inline fun TetherOffsetFunction(
    noinline fn: Provider<Double>,
): TetherOffsetType =
    legacyUnsafeCast(fn)
