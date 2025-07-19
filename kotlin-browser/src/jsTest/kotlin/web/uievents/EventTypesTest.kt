package web.uievents

import web.mouse.WHEEL
import web.mouse.WheelEvent
import web.pointer.CLICK
import web.pointer.PointerEvent
import kotlin.test.Test
import kotlin.test.assertEquals

class EventTypesTest {
    @Test
    fun import1() {
        assertEquals<Any>("click", PointerEvent.CLICK)
    }

    @Test
    fun import2() {
        assertEquals<Any>("wheel", WheelEvent.WHEEL)
    }
}
