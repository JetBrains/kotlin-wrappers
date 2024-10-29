package node.events

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class GeneratedEventInstanceTest {
    @Test
    fun checkDataEvent() {
        val target = MyEmitter()
        val dataEvent = target.dataEvent

        assertIs<EventInstance<*>>(dataEvent)
        assertEquals<Any>(target, dataEvent.emitter)
        assertEquals<Any>("data", dataEvent.type)
    }
}
