package js.function

import js.core.emptyTuple
import kotlin.test.Test
import kotlin.test.assertEquals

class JsFunction {
    @Test
    fun apply() {
        val expectedResult = 42
        val fn = JsFunction { expectedResult }

        val actualResult = fn.apply(null, emptyTuple())

        assertEquals(expectedResult, actualResult)
    }
}
