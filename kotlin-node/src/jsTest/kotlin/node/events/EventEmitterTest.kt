package node.events

import kotlin.test.Test
import kotlin.test.assertEquals

class EventEmitterTest {
    @Test
    fun should_subscribe_and_unsubscribe() {
        var actualOne: Any? = null
        var actualTwo: Any? = null
        var actualThree: Any? = null

        var invocationCount = 0

        val test = EventType("test")
        val emitter = EventEmitter()

        val listener = EventListener { one, two, three ->
            actualOne = one
            actualTwo = two
            actualThree = three

            invocationCount++
        }

        assertEquals(0, invocationCount)

        emitter.on(test, listener)
        emitter.emit(test, 1, "two", true)

        assertEquals(1, actualOne)
        assertEquals("two", actualTwo)
        assertEquals(true, actualThree)

        assertEquals(1, invocationCount)

        emitter.off(test, listener)
        emitter.emit(test, 1, "two", true)

        assertEquals(1, invocationCount)
    }

    @Test
    fun should_handle_optional_listeners() {
        val emitter = EventEmitter()

        val test = EventType("test")
        val listenerCount = emitter.listenerCount(test /* optional listener is here*/)

        assertEquals(0, listenerCount.toInt())
    }
}
