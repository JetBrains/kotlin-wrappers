package web.events

import web.events.ProgressEvent.Companion.PROGRESS
import kotlin.test.Test
import kotlin.test.assertEquals

class EventTypesTest {
    @Test
    fun import() {
        assertEquals<Any>("abort", ProgressEvent.ABORT)
    }

    @Test
    fun staticImport() {
        assertEquals<Any>("progress", PROGRESS)
    }
}
