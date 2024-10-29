package web.http

import js.errors.TypeError
import js.globals.globalThis
import js.promise.Promise
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import web.events.Event
import web.events.addEventHandler
import web.events.addHandler
import kotlin.test.*

class FetchTest {
    private val request = Request("localhost:8080")
    private val originalFetch = globalThis.fetch

    @AfterTest
    fun tearDown() {
        globalThis.fetch = originalFetch
    }

    @Test
    fun should_return_result_on_success() = runTest {
        val expectedResult = 42
        val response = Response.json(expectedResult)

        globalThis.fetch = { Promise.resolve(response) }

        val actualResult = fetch(request).json() as Int

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun should_throw_exception_on_error() = runTest {
        globalThis.fetch = { Promise.reject(IllegalStateException("Test error")) }

        assertFailsWith<IllegalStateException> {
            fetch(request)
        }.also {
            assertEquals("Test error", it.message)
        }
    }

    @Test
    fun should_be_canceled_on_parent_job_cancellation() = runTest {
        var isCanceled = false

        globalThis.fetch = { request: Request ->
            request.signal.abortEvent.addHandler {
                isCanceled = true
            }

            // infinite promise
            Promise<Nothing> { _ -> }
        }

        val parentJob = launch { fetch(request) }
        testScheduler.runCurrent()
        parentJob.cancel()

        assertTrue(isCanceled)
    }

    @Test
    fun emulate_real_fetch_which_throws_error_on_cancellation() = runTest {
        var isCanceled = false

        globalThis.fetch = { request: Request ->
            Promise<Nothing> { _, reject ->
                request.signal.abortEvent.addHandler {
                    isCanceled = true

                    reject(request.signal.reason ?: TypeError("Failed to fetch"))
                }
            }
        }

        val deferred = async { fetch(request) }
        testScheduler.runCurrent()
        deferred.cancel()

        assertTrue(isCanceled)

        assertFailsWith<CancellationException> {
            deferred.await()
        }
    }

    @Test
    fun should_be_canceled_on_parent_job_error() = runTest {
        var isCanceled = false

        globalThis.fetch = { request: Request ->
            request.signal.addEventHandler(Event.ABORT) {
                isCanceled = true
            }

            // infinite promise
            Promise<Nothing> { _ -> }
        }

        assertFailsWith<IllegalStateException> {
            coroutineScope {
                launch { fetch(request) }
                launch { error("Test error") }
            }
        }.also {
            assertEquals("Test error", it.message)
        }

        assertTrue(isCanceled)
    }
}
