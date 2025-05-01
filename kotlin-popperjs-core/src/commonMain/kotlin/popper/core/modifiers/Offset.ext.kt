package popper.core.modifiers

import js.array.Tuple2
import js.array.tupleOf
import js.core.JsInt
import js.core.JsPrimitives.toJsInt
import js.reflect.unsafeCast

inline fun Offset(
    x: Int?,
    y: Int?,
): OffsetType =
    unsafeCast(tupleOf(x?.toJsInt(), y?.toJsInt()))

inline fun OffsetFunction(
    noinline fn: Provider<Tuple2<JsInt?, JsInt?>>,
): OffsetType =
    unsafeCast(fn)
