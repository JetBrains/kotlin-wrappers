package web.http

import js.core.jso
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.AbortController
import web.abort.AbortSignal
import web.abort.any
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

        val signals = arrayOf(input.signal, controller.signal)

        val request = Request(
            input = input,
            init = jso {
                signal = AbortSignal.any(signals)
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
