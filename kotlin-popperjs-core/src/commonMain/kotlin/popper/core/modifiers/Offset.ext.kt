package popper.core.modifiers

import js.array.JsTuple2
import js.array.tupleOf
import js.core.JsInt
import js.reflect.unsafeCast

inline fun Offset(
    x: Double?,
    y: Double?,
): OffsetType =
    unsafeCast(tupleOf(x, y))

inline fun OffsetFunction(
    noinline fn: Provider<JsTuple2<JsInt?, JsInt?>>,
): OffsetType =
    unsafeCast(fn)
