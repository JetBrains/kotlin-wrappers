package node.events

import js.array.JsTuple
import js.array.JsTuple3
import js.array.tupleOf
import kotlin.test.Test
import kotlin.test.assertEquals

class EventEmitterTest {
    @Test
    fun should_subscribe_and_unsubscribe() {
        var actualOne: Int? = null
        var actualTwo: String? = null
        var actualThree: Boolean? = null

        var invocationCount = 0

        val test = EventType<EventEmitter, JsTuple3<Int, String, Boolean>>("test")
        val emitter = EventEmitter()

        val listener = { (one, two, three): JsTuple3<Int, String, Boolean> ->
            actualOne = one
            actualTwo = two
            actualThree = three

            invocationCount++
            Unit
        }

        assertEquals(0, invocationCount)

        emitter.on(test, listener)
        emitter.emit(test, tupleOf(1, "two", true))

        assertEquals(1, actualOne)
        assertEquals("two", actualTwo)
        assertEquals(true, actualThree)

        assertEquals(1, invocationCount)

        emitter.off(test, listener)
        emitter.emit(test, tupleOf(1, "two", true))

        assertEquals(1, invocationCount)
    }

    @Test
    fun should_handle_optional_listeners() {
        val emitter = EventEmitter()

        val test = EventType<EventEmitter, JsTuple>("test")
        val listenerCount = emitter.listenerCount(test /* optional listener is here*/)

        assertEquals(0, listenerCount.toInt())
    }
}
