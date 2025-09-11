// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.assembly

import js.core.*
import js.function.JsFunction
import js.reflect.unsafeCast
import kotlin.js.JsAny

sealed external interface ValueType<T : JsAny?> {
    companion object
}

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
