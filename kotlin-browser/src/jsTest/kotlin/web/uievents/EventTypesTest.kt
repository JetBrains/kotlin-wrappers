package web.uievents

import web.events.EventTarget
import web.uievents.WheelEvent.Companion.wheel
import kotlin.test.Test
import kotlin.test.assertEquals

class EventTypesTest {
    @Test
    fun import() {
        assertEquals<Any>("click", MouseEvent.click<EventTarget>())
    }

    @Test
    fun staticImport() {
        assertEquals<Any>("wheel", wheel<EventTarget>())
    }
}
