package web.events

import kotlin.test.Test
import kotlin.test.assertEquals

class EventTypesTest {
    @Test
    fun import1() {
        assertEquals<Any>("abort", ProgressEvent.ABORT)
    }

    @Test
    fun import2() {
        assertEquals<Any>("progress", ProgressEvent.PROGRESS)
    }
}
