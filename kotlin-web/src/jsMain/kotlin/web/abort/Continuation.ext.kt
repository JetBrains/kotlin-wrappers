package web.abort

import kotlinx.coroutines.CancellableContinuation

fun CancellableContinuation<*>.toAbortSignal(): AbortSignal {
    val controller = AbortController()

    invokeOnCancellation {
        controller.abort()
    }

    return controller.signal
}
