package web.uievents

import web.uievents.WheelEvent.Companion.WHEEL
import kotlin.test.Test
import kotlin.test.assertEquals

class EventTypesTest {
    @Test
    fun import() {
        assertEquals<Any>("click", PointerEvent.CLICK)
    }

    @Test
    fun staticImport() {
        assertEquals<Any>("wheel", WHEEL)
    }
}
