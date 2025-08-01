package popper.core.modifiers

import js.core.JsDouble
import js.reflect.unsafeCast

inline fun TetherOffset(
    x: Double,
): TetherOffsetType =
    unsafeCast(x)

inline fun TetherOffsetFunction(
    noinline fn: Provider<JsDouble>,
): TetherOffsetType =
    unsafeCast(fn)
