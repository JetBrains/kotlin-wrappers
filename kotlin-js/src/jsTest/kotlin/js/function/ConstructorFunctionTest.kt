package js.function

import js.array.Tuple
import kotlin.test.Test
import kotlin.test.assertEquals

@JsExport
class X {
    var value: String = "test"
}

class ConstructorFunctionTest {

    @Test
    fun testReifiedKClassAdapter() {
        val result = ConstructorFunction<Tuple, X>()()
        assertEquals("test", result.value)
    }

    @Test
    fun testKClassAdapter() {
        val result = ConstructorFunction<Tuple, _>(X::class)()
        assertEquals("test", result.value)
    }

    @Test
    fun testJsClassAdapter() {
        val result = ConstructorFunction<Tuple, _>(X::class.js)()
        assertEquals("test", result.value)
    }
}
