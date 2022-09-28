package web.http

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.js.jso
import org.w3c.fetch.Response
import web.AbortController
import web.url.URL
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

suspend fun fetch(
    input: Request,
): Response =
    suspendCancellableCoroutine { continuation ->
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
            .then { continuation.resume(it) }
            .catch { continuation.resumeWithException(FetchException(it)) }
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
