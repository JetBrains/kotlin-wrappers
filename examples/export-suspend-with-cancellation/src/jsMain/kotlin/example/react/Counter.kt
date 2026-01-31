package example.react

import js.promise.Promise
import js.promise.invoke
import kotlinx.coroutines.delay
import web.abort.Abortable
import web.console.console
import web.events.ABORT
import web.events.Event
import web.events.addEventHandler
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.startCoroutine

@JsExport
class Counter {

    // With export it should have cancellation in JS by default
    private suspend fun run(
        callback: (value: Int) -> Unit,
    ): Nothing {
        var i = 0
        while (true) {
            callback(i++)
            delay(300)
        }
    }

    @JsName("run")
    fun runAsync(
        callback: (value: Int) -> Unit,
        // should be added by Kotlin
        options: Abortable? = null,
    ): Promise<Nothing> =
        Promise { _, reject ->
            val continuation = Continuation<Nothing>(
                context = EmptyCoroutineContext,
                resumeWith = { result -> reject(result.exceptionOrNull()!!) },
            )

            options?.signal?.addEventHandler(Event.ABORT) {
                val exception = CancellationException(IllegalStateException("Aborted!!!"))
                continuation.resumeWith(Result.failure(exception))
            }

            console.log("Run!")
            (suspend { run(callback) })
                .startCoroutine(continuation)
        }
}
