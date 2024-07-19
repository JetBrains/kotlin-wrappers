package react.internal

import kotlinx.coroutines.test.runTest
import web.events.subscribe
import web.window.clickEvent
import web.window.mouseUpEvent
import web.window.window
import kotlin.test.Test
import kotlin.test.assertEquals

class IsolatedJobTest {
    @Test
    fun launch() = runTest {
        var a = 13

        isolatedJob {
            a = 42
        }

        assertEquals(42, a)
    }

    @Test
    fun launchWithSubscribe() = runTest {
        var a = 13

        isolatedJob {
            window.clickEvent.subscribe { /* do nothing */ }
            window.mouseUpEvent.subscribe { /* do nothing */ }

            a = 42
        }

        assertEquals(42, a)
    }
}
