// Automatically generated - do not modify!

package web.assembly

import js.function.JsFunction
import js.numbers.BigInt
import js.numbers.JsDouble
import js.numbers.JsFloat
import js.numbers.JsInt
import js.reflect.unsafeCast
import js.union.JsUnion
import js.void.Void

@JsUnion
sealed /* union */
external interface ValueType<T : JsAny?>

inline val ValueType.Companion.anyfunc: ValueType<JsFunction<*, *>>
    get() = unsafeCast("anyfunc")

inline val ValueType.Companion.externref: ValueType<JsAny?>
    get() = unsafeCast("externref")

inline val ValueType.Companion.f32: ValueType<JsFloat>
    get() = unsafeCast("f32")

inline val ValueType.Companion.f64: ValueType<JsDouble>
    get() = unsafeCast("f64")

inline val ValueType.Companion.i32: ValueType<JsInt>
    get() = unsafeCast("i32")

inline val ValueType.Companion.i64: ValueType<BigInt>
    get() = unsafeCast("i64")

inline val ValueType.Companion.v128: ValueType<Void>
    get() = unsafeCast("v128")
