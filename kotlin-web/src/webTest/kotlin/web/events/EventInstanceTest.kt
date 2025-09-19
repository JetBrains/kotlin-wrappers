package web.events

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class EventInstanceTest {
    @Test
    fun `1 subscribe`() = runTest {
        var a = 13
        val target = EventTarget()

        val job1 = target.changeEvent()
            .subscribe { a++ }

        assertEquals(13, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(14, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(15, a)

        // stop
        job1.cancel()
    }

    @Test
    fun `2 subscribe`() = runTest {
        val payloads = mutableListOf<Int>()
        val target = EventTarget()

        val job1 = target.changeEvent()
            .subscribe { payloads.add(1) }

        val job2 = target.changeEvent()
            .subscribe { payloads.add(2) }

        assertEquals(listOf(), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 2), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 2, 1, 2), payloads)

        // stop
        job1.cancel()
        job2.cancel()
    }
}
