package js.disposable.internal

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class SuspendCloseableTest {
    @Test
    fun testResourceCleanup() = runTest {
        var isClosed = false
        val resource = SuspendAutoCloseable {
            // emulate asynchronous cleanup
            delay(1.milliseconds)
            isClosed = true
        }

        resource.use { }

        assertTrue(isClosed)
    }

    @Test
    fun testResourceCleanupAfterException() = runTest {
        var isClosed = false
        val resource = SuspendAutoCloseable {
            // emulate asynchronous cleanup
            delay(1.milliseconds)
            isClosed = true
        }

        val result = runCatching {
            resource.use { error("Error") }
        }

        assertTrue(result.isFailure)
        assertTrue(isClosed)
    }

    @Test
    fun testResourceCleanupAfterCancellation() = runTest {
        var isStarted = false
        var isEnded = false
        var isClosed = false
        val resource = SuspendAutoCloseable {
            // emulate asynchronous cleanup
            delay(1.milliseconds)
            isClosed = true
        }

        val job = launch(start = CoroutineStart.UNDISPATCHED) {
            resource.use {
                isStarted = true
                delay(1.seconds)
                isEnded = true
            }
        }

        job.cancelAndJoin()

        assertTrue(isStarted)
        assertFalse(isEnded)
        assertTrue(isClosed)
    }
}
