package web.events

import web.events.ProgressEvent.Companion.progress
import kotlin.test.Test
import kotlin.test.assertEquals

class EventTypesTest {
    @Test
    fun import() {
        assertEquals<Any>("abort", ProgressEvent.abort<EventTarget>())
    }

    @Test
    fun staticImport() {
        assertEquals<Any>("progress", progress<EventTarget>())
    }
}
