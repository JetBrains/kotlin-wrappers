package web.abort

import js.array.jsArrayOf
import js.errors.toThrowable
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import web.events.addHandler

infix fun AbortSignal.or(
    signal: AbortSignal,
): AbortSignal =
    AbortSignal.any(jsArrayOf(this, signal))

infix fun AbortSignal.or(
    signal: AbortSignal?,
): AbortSignal =
    if (signal != null) {
        this or signal
    } else {
        this
    }

infix fun AbortSignal?.or(
    signal: AbortSignal,
): AbortSignal =
    if (this != null) {
        this or signal
    } else {
        signal
    }

infix fun AbortSignal?.or(
    signal: AbortSignal?,
): AbortSignal? =
    if (this != null && signal != null) {
        this or signal
    } else {
        this ?: signal
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
