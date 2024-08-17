package js.function

import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalJsExport::class)
@JsExport
class X {
    var value: String = "test"
}

class JsConstructorFunctionTest {

    @Test
    fun testDefaultConstructor() {
        val result = JsConstructorFunction(X::class.js)()
        assertEquals("test", result.value)
    }
}
