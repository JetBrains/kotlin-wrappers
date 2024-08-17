package js.function

import js.array.JsTuple
import kotlin.test.Test
import kotlin.test.assertEquals

@JsExport
class X {
    var value: String = "test"
}

class JsConstructorFunctionTest {

    @Test
    fun testReifiedKClassAdapter() {
        val result = JsConstructorFunction<JsTuple, X>()()
        assertEquals("test", result.value)
    }

    @Test
    fun testKClassAdapter() {
        val result = JsConstructorFunction<JsTuple, X>(X::class)()
        assertEquals("test", result.value)
    }

    @Test
    fun testJsClassAdapter() {
        val result = JsConstructorFunction<JsTuple, X>(X::class.js)()
        assertEquals("test", result.value)
    }
}
