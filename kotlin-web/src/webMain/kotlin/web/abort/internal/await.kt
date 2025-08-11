package web.abort.internal

import js.core.JsAny
import js.internal.InternalApi
import js.objects.Object
import js.objects.unsafeJso
import js.promise.PromiseLike
import js.promise.thenTo
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.AbortController
import web.abort.Abortable

@InternalApi
fun <T : Abortable> patchAbortOptions(
    options: T?,
    controller: AbortController,
): T {
    val abortOptions = createAbortable<T>(
        signal = safeAny(options?.signal, controller.signal)
    )

    return Object.assign(unsafeJso(), options, abortOptions)
}

// Used in the compiler plugin
internal suspend fun <T : JsAny?> awaitPromiseLike(
    promise: PromiseLike<T>,
    controller: AbortController,
): T =
    promise.awaitCancellable(controller)

@InternalApi
suspend fun <T : JsAny?> PromiseLike<T>.awaitCancellable(
    controller: AbortController,
): T =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation {
            controller.abort()
        }

        thenTo(continuation)
    }
