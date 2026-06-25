package web.abort

import js.array.jsArrayOf
import js.errors.toThrowable
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import web.events.addHandler

infix fun AbortSignal.or(
    other: AbortSignal,
): AbortSignal =
    AbortSignal.any(jsArrayOf(this, other))

infix fun AbortSignal.or(
    other: AbortSignal?,
): AbortSignal {
    other ?: return this

    return this or other
}

infix fun AbortSignal?.or(
    other: AbortSignal,
): AbortSignal {
    this ?: return other

    return this or other
}

infix fun AbortSignal?.or(
    other: AbortSignal?,
): AbortSignal? {
    this ?: return other
    other ?: return this

    return this or other
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
