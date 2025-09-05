package web.coroutines

import js.errors.toThrowable
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import web.abort.AbortSignal
import web.abort.AbortableLike
import web.abort.abortEvent
import web.events.addHandler

fun CoroutineScope(
    signal: AbortSignal,
): CoroutineScope {
    val job = Job()

    fun cancel() {
        val cause = signal.reason
            ?.toThrowable()
            ?.let { CancellationException(it.message, it) }

        job.cancel(cause)
    }

    if (signal.aborted) {
        cancel()
    } else {
        signal.abortEvent.addHandler {
            cancel()
        }
    }

    return CoroutineScope(job)
}

fun CoroutineScope(
    abortable: AbortableLike,
): CoroutineScope =
    CoroutineScope(abortable.signal)
