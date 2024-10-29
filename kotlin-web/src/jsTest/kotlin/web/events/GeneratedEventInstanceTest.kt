package web.events

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

@JsName("EventTarget")
private external class MyTarget {
    @JsEvent("data")
    val dataEvent: EventInstance<Event, *, *>
}


class GeneratedEventInstanceTest {
    @Test
    fun checkDataEvent() {
        val target = MyTarget()
        val dataEvent = target.dataEvent

        assertIs<EventInstance<*, *, *>>(dataEvent)
        assertEquals<Any>(target, dataEvent.target)
        assertEquals<Any>("data", dataEvent.type)
    }
}
