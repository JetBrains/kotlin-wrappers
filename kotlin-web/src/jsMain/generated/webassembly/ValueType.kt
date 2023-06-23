// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webassembly

import js.core.BigInt
import js.core.Void

// language=JavaScript
@JsName("""(/*union*/{anyfunc: 'anyfunc', externref: 'externref', f32: 'f32', f64: 'f64', i32: 'i32', i64: 'i64', v128: 'v128'}/*union*/)""")
sealed external interface ValueType<T> {
    companion object {
        val anyfunc: ValueType<Function<*>>
        val externref: ValueType<Any?>
        val f32: ValueType<Number>
        val f64: ValueType<Number>
        val i32: ValueType<Number>
        val i64: ValueType<BigInt>
        val v128: ValueType<Void>
    }
}
