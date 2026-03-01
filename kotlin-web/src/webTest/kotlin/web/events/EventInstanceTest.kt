package web.events

import js.test.runJsTest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.test.Test
import kotlin.test.assertEquals

class EventInstanceTest {
    @Test
    fun `1 subscribe`() = runJsTest {
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
    fun `1 launch.collect`() = runJsTest {
        var a = 13
        val target = EventTarget()

        val job1 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .subscribe { a++ }
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
    fun `2 subscribe`() = runJsTest {
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

    @Test
    fun `2 launch.collect`() = runJsTest {
        val payloads = mutableListOf<Int>()
        val target = EventTarget()

        val job1 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .subscribe { payloads.add(1) }
        }

        val job2 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .subscribe { payloads.add(2) }
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
    fun `subscribe -> handler -> subscribe`() = runJsTest {
        val payloads = mutableListOf<Int>()
        val target = EventTarget()

        val job1 = target.changeEvent()
            .subscribe { payloads.add(1) }

        target.changeEvent.addHandler { payloads.add(48) }

        val job2 = target.changeEvent()
            .subscribe { payloads.add(2) }

        assertEquals(listOf(), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 48, 2), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 48, 2, 1, 48, 2), payloads)

        // stop
        job1.cancel()
        job2.cancel()
    }

    @Test
    fun `launch.collect -> handler -> launch.collect`() = runJsTest {
        val payloads = mutableListOf<Int>()
        val target = EventTarget()

        val job1 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .subscribe { payloads.add(1) }
        }

        target.changeEvent.addHandler { payloads.add(48) }

        val job2 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .subscribe { payloads.add(2) }
        }

        assertEquals(listOf(), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 48, 2), payloads)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(listOf(1, 48, 2, 1, 48, 2), payloads)

        // stop
        job1.cancel()
        job2.cancel()
    }

    @Test
    fun `subscribe -> handler -> subscribe -> handler`() = runJsTest {
        val payloads = mutableListOf<Int>()
        val target = EventTarget()

        val job1 = target.changeEvent()
            .subscribe { payloads.add(1) }

        target.changeEvent.addHandler { payloads.add(48) }

        val job2 = target.changeEvent()
            .subscribe { payloads.add(2) }

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

    @Test
    fun `launch.collect -> handler -> launch.collect -> handler`() = runJsTest {
        val payloads = mutableListOf<Int>()
        val target = EventTarget()

        val job1 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .subscribe { payloads.add(1) }
        }

        target.changeEvent.addHandler { payloads.add(48) }

        val job2 = launch(Dispatchers.Unconfined) {
            target.changeEvent()
                .subscribe { payloads.add(2) }
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
