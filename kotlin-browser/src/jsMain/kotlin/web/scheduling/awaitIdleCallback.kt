package web.scheduling

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

suspend fun awaitIdleCallback(
    options: IdleRequestOptions? = null,
): IdleDeadline =
    suspendCancellableCoroutine { continuation ->
        val requestId = requestIdleCallback(continuation::resume, options)

        continuation.invokeOnCancellation {
            cancelIdleCallback(requestId)
        }
    }
