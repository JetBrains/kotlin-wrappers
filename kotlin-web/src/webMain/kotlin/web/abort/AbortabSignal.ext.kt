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
): AbortSignal {
    signal ?: return this

    return this or signal
}

infix fun AbortSignal?.or(
    signal: AbortSignal,
): AbortSignal {
    this ?: return signal

    return this or signal
}

infix fun AbortSignal?.or(
    signal: AbortSignal?,
): AbortSignal? {
    this ?: return signal
    signal ?: return this

    return this or signal
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
