package kotlinx.js

import kotlinx.coroutines.suspendCancellableCoroutine
import org.w3c.dom.url.URL
import org.w3c.fetch.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

suspend fun fetch(
    input: Request,
): Response {
    require(input.signal == null) {
        "Parent `AbortSignal` currently not supported!"
    }

    return suspendCancellableCoroutine { continuation ->
        val controller = AbortController()

        continuation.invokeOnCancellation {
            controller.abort()
        }

        val request = Request(
            input = input,
            init = jso {
                signal = controller.signal
            }
        )

        fetchAsync(request)
            .then(continuation::resume)
            .catch(continuation::resumeWithException)
    }
}

suspend fun fetch(
    input: Request,
    init: RequestInit,
): Response =
    fetch(Request(input, init))

suspend fun fetch(
    input: String,
): Response =
    fetch(Request(input))

suspend fun fetch(
    input: String,
    init: RequestInit,
): Response =
    fetch(Request(input, init))

suspend fun fetch(
    input: URL,
): Response =
    fetch(Request(input))

suspend fun fetch(
    input: URL,
    init: RequestInit,
): Response =
    fetch(Request(input, init))
