package node.events

import js.array.JsTuple
import js.array.JsTuple3
import kotlin.test.Test
import kotlin.test.assertEquals

class DecorateListenerTest {
    @Test
    fun should_return_the_same_reference_for_the_same_listener() {
        val listener = { (one, two, three): JsTuple3<Int, String, Boolean> ->
            println(one)
            println(two)
            println(three)
        }

        val firstDecoratedListener = decorateListener(listener)
        val secondDecoratedListener = decorateListener(listener)

        assertEquals(firstDecoratedListener, secondDecoratedListener)
    }

    @Test
    fun should_create_function_that_calls_original_function_with_arguments_as_a_tuple() {
        var actualOne: Int? = null
        var actualTwo: String? = null
        var actualThree: Boolean? = null

        val listener = { (one, two, three): JsTuple3<Int, String, Boolean> ->
            actualOne = one
            actualTwo = two
            actualThree = three
        }

        val decoratedListener = decorateListener(listener).unsafeCast<(Int, String, Boolean) -> Unit>()
        decoratedListener(1, "two", true)

        assertEquals(1, actualOne)
        assertEquals("two", actualTwo)
        assertEquals(true, actualThree)
    }

    @Test
    fun should_pass_through_undefined_value_to_support_optional_parameters() {
        val listener = undefined.unsafeCast<(JsTuple) -> Unit>()

        val decoratedListener = decorateListener(listener).unsafeCast<(Int, String, Boolean) -> Unit>()

        assertEquals<Any?>(undefined, decoratedListener)
    }
}
