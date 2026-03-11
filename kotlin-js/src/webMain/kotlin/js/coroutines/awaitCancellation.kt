package js.coroutines

import kotlinx.coroutines.suspendCancellableCoroutine

/**
 * Extended version of [awaitCancellation](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/await-cancellation.html)
 */
suspend fun awaitCancellation(
    block: () -> Unit,
): Nothing =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation {
            block()
        }
    }
