package web.scheduling

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

/**
 * Suspend adapter for [requestIdleCallback]
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/requestIdleCallback)
 */
suspend fun awaitIdleCallback(
    options: IdleRequestOptions? = null,
): IdleDeadline =
    suspendCancellableCoroutine { continuation ->
        val requestId = requestIdleCallback(continuation::resume, options)

        continuation.invokeOnCancellation {
            cancelIdleCallback(requestId)
        }
    }
