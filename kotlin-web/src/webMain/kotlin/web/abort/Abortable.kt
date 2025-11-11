package web.abort

import js.errors.toThrowable
import js.objects.JsPlainObject
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import web.events.addHandler

@JsPlainObject
external interface Abortable {
    /**
     * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
     */
    var signal: AbortSignal?
}

fun AbortSignal.asCoroutineScope(): CoroutineScope {
    val job = Job()

    fun cancel() {
        val cause = reason
            ?.toThrowable()
            ?.let { CancellationException(it.message, it) }

        job.cancel(cause)
    }

    if (aborted) {
        cancel()
    } else {
        abortEvent.addHandler {
            cancel()
        }
    }

    return CoroutineScope(job)
}
