package js.coroutines.internal

import kotlinx.coroutines.*

suspend fun internalSubscribeJob(
    subscribe: () -> () -> Unit,
): Job =
    CoroutineScope(currentCoroutineContext())
        .launch(start = CoroutineStart.UNDISPATCHED) {
            suspendCancellableCoroutine<Nothing> { continuation ->
                val unsubscribe = subscribe()

                continuation.invokeOnCancellation {
                    unsubscribe()
                }
            }
        }
