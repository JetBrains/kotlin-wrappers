// Automatically generated - do not modify!

package web.assembly

import js.core.BigInt
import js.core.Void
import seskar.js.JsValue

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
