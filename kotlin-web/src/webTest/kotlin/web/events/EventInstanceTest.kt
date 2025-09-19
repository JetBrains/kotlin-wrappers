package web.events

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class EventInstanceTest {
    @Test
    fun `simple subscribe`() = runTest {
        var a = 13
        val target = EventTarget()

        val job = target.changeEvent().subscribe { a++ }

        assertEquals(13, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(14, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(15, a)

        job.cancel()
    }
}
