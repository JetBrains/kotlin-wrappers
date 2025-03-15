// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.assembly

import js.core.*
import js.function.JsFunction
import seskar.js.JsValue

sealed external interface ValueType<T : JsAny?> {
    companion object {
        @JsValue("anyfunc")
        val anyfunc: ValueType<JsFunction<*, *>>

        @JsValue("externref")
        val externref: ValueType<JsAny?>

        @JsValue("f32")
        val f32: ValueType<JsFloat>

        @JsValue("f64")
        val f64: ValueType<JsDouble>

        @JsValue("i32")
        val i32: ValueType<JsInt>

        @JsValue("i64")
        val i64: ValueType<BigInt>

        @JsValue("v128")
        val v128: ValueType<Void>
    }
}
