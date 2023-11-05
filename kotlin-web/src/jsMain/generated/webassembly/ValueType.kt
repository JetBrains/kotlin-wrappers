// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webassembly

import js.core.BigInt
import js.core.Void
import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ValueType<T> {
    companion object {
        @JsValue("anyfunc")
        val anyfunc: ValueType<Function<*>>

        @JsValue("externref")
        val externref: ValueType<Any?>

        @JsValue("f32")
        val f32: ValueType<Number>

        @JsValue("f64")
        val f64: ValueType<Number>

        @JsValue("i32")
        val i32: ValueType<Number>

        @JsValue("i64")
        val i64: ValueType<BigInt>

        @JsValue("v128")
        val v128: ValueType<Void>
    }
}
