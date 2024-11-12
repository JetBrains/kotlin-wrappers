package web.events

import kotlin.test.Test
import kotlin.test.assertEquals

class CustomEventInitTest {
    @Test
    fun testDetail() {
        val init = CustomEventInit(detail = "my-detail")

        assertEquals("my-detail", init.detail)
    }
}
