package react.internal

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import web.events.CHANGE
import web.events.Event
import web.events.EventTarget
import web.events.invoke
import kotlin.test.Test
import kotlin.test.assertEquals

class IsolatedJobTest {
    @Test
    fun `should invoke block synchronously`() = runTest {
        var a = 13

        runIsolatedJob {
            a = 42
        }

        assertEquals(42, a)
    }

    @Test
    fun `should allow subscribing to events synchronously`() = runTest {
        var a = 13
        val target = EventTarget()

        runIsolatedJob {
            launch(Dispatchers.Unconfined) {
                target.changeEvent().collect { a++ }
            }

            a = 42
        }

        assertEquals(42, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(43, a)

        target.dispatchEvent(Event(Event.CHANGE))
        assertEquals(44, a)
    }
}
