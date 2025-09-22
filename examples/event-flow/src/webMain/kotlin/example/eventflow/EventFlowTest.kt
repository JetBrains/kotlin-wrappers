package example.eventflow

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.plus
import web.console.console
import web.events.*

suspend fun eventFlowTest(): Unit = coroutineScope {
    val payloads = mutableListOf<Int>()
    val target = EventTarget()

    val job1 = target.changeEvent()
        .onEach { payloads.add(1) }
        .launchIn(this + Dispatchers.Unconfined)

    target.changeEvent.addHandler { payloads.add(48) }

    val job2 = target.changeEvent()
        .onEach { payloads.add(2) }
        .launchIn(this + Dispatchers.Unconfined)

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

private fun <T : Any> assertEquals(
    expected: T,
    actual: T,
) {
    if (expected != actual) {
        console.error("Expected <$expected>, actual <$actual>.")
    }
}
