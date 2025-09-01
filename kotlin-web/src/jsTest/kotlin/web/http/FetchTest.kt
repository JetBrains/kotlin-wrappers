package web.http

import js.core.JsAny
import js.errors.TypeError
import js.errors.toJsError
import js.errors.toJsErrorLike
import js.globals.globalThis
import js.promise.Promise
import js.promise.invoke
import js.reflect.unsafeCast
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import web.abort.abortEvent
import web.errors.DOMException
import web.events.addHandler
import kotlin.test.*

private const val FETCH = "fetch"

private external interface FetchFunction

private inline fun FetchFunction(
    noinline value: (Request) -> Promise<Response>,
): FetchFunction =
    unsafeCast(provider = value)

class FetchTest {
    private val request = Request("localhost:8080")
    private val originalFetch = globalThis[FETCH]

    @AfterTest
    fun tearDown() {
        globalThis[FETCH] = originalFetch
    }

    @Test
    fun should_return_result_on_success() = runTest {
        val expectedResult = 42
        val response = Response.json(expectedResult)

        globalThis[FETCH] = FetchFunction { Promise.resolve(response) }

        val actualResult = fetch(request).json() as Int

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun should_throw_exception_on_error() = runTest {
        globalThis[FETCH] = FetchFunction { Promise.reject(DOMException("Test error")) }

        val error: JsAny = assertFailsWith<Throwable> {
            fetch(request)
        }.toJsErrorLike()

        assertIs<DOMException>(error)
        assertEquals("Test error", error.message)
    }

    @Test
    fun should_be_canceled_on_parent_job_cancellation() = runTest {
        var isCanceled = false

        globalThis[FETCH] = FetchFunction { request ->
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

        globalThis[FETCH] = FetchFunction { request ->
            Promise<Nothing> { _, reject ->
                request.signal.abortEvent.addHandler {
                    isCanceled = true

                    val reason = request.signal.reason?.toJsError()
                        ?: TypeError("Failed to fetch")

                    reject(reason)
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

        globalThis[FETCH] = FetchFunction { request ->
            request.signal.abortEvent.addHandler {
                isCanceled = true
            }

            // infinite promise
            Promise<Nothing> { _ -> }
        }

        val exception = assertFailsWith<IllegalStateException> {
            coroutineScope {
                launch { fetch(request) }
                launch { error("Test error") }
            }
        }

        assertEquals("Test error", exception.message)

        assertTrue(isCanceled)
    }
}
