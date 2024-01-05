package js.function

import js.array.JsTuple2
import kotlin.test.Test
import kotlin.test.assertEquals

class JsFunctionTest {
    @Test
    fun invoke() {
        val expectedResult = 42
        val fn = JsFunction<Int> { expectedResult }

        val actualResult = fn()

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun cast_function_without_parameters_to_function_with_2_parameters() {
        val expectedResult = 42
        val fn: JsFunction<JsTuple2<Int, String>, Int> = JsFunction<Int> { expectedResult }

        val actualResult = fn(100500, "some string")

        assertEquals(expectedResult, actualResult)
    }
}
