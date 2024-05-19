package web.timers.test

import kotlinx.coroutines.suspendCancellableCoroutine
import web.timers.clearTimeout
import web.timers.setTimeout
import kotlin.coroutines.resume
import kotlin.time.Duration

/**
 * Replacement for `delay` in tests
 */
suspend fun awaitTimeout(
    timeout: Duration,
) {
    suspendCancellableCoroutine { continuation ->
        val timeoutId = setTimeout(
            timeout = timeout,
            handler = { continuation.resume(Unit) },
        )

        continuation.invokeOnCancellation {
            clearTimeout(timeoutId)
        }
    }
}
