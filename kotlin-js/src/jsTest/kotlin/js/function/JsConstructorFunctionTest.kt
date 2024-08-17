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
    fun testDefaultConstructor() {
        val result = JsConstructorFunction<JsTuple, X>(X::class.js)()
        assertEquals("test", result.value)
    }
}
