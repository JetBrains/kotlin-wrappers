package web.events

import js.test.runJsTest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.test.Test
import kotlin.test.assertEquals

class EventInstanceTest {
    @Test
    fun `should notify listener synchronously after dispatch event`() = runJsTest {
        var a = 13
        val target = EventTarget()

        val job1 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .collect { a++ }
        }

        assertEquals(13, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(14, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(15, a)

        // stop
        job1.cancel()
    }

    @Test
    fun `should notify multiple listeners synchronously after dispatch event`() = runJsTest {
        val payloads = mutableListOf<Int>()
        val target = EventTarget()

        val job1 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .collect { payloads.add(1) }
        }

        val job2 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .collect { payloads.add(2) }
        }

        assertEquals(listOf(), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 2), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 2, 1, 2), payloads)

        // stop
        job1.cancel()
        job2.cancel()
    }

    @Test
    fun `should notify listeners synchronously in order of subscription`() = runJsTest {
        val payloads = mutableListOf<Int>()
        val target = EventTarget()

        val job1 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .collect { payloads.add(1) }
        }

        target.changeEvent.addHandler { payloads.add(48) }

        val job2 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .collect { payloads.add(2) }
        }

        target.changeEvent.addHandler { payloads.add(17) }

        assertEquals(listOf(), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 48, 2, 17), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 48, 2, 17, 1, 48, 2, 17), payloads)

        // stop
        job1.cancel()
        job2.cancel()
    }
}
