package web.coroutines

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

    if (signal.aborted) {
        job.cancel()
    } else {
        signal.abortEvent.addHandler {
            job.cancel()
        }
    }

    return CoroutineScope(job)
}

fun CoroutineScope(
    abortable: AbortableLike,
): CoroutineScope =
    CoroutineScope(abortable.signal)
