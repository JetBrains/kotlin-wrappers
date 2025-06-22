package web.abort.internal

import js.core.JsAny
import js.objects.Object
import js.objects.unsafeJso
import js.promise.PromiseLike
import js.promise.thenTo
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.AbortController
import web.abort.Abortable

internal fun <T : Abortable> patchAbortOptions(
    options: T?,
    controller: AbortController,
): T {
    val abortOptions = createAbortable(
        signal = safeAny(options?.signal, controller.signal)
    )

    return Object.assign(unsafeJso(), options, abortOptions)
}

internal suspend fun <T : JsAny?> awaitPromiseLike(
    promise: PromiseLike<T>,
    controller: AbortController,
): T =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation {
            controller.abort()
        }

        promise.thenTo(continuation)
    }
