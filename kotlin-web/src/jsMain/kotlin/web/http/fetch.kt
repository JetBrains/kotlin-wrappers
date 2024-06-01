package web.http

import js.objects.jso
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.toAbortSignal
import web.url.URL

suspend fun fetch(
    input: Request,
): Response =
    suspendCancellableCoroutine { continuation ->
        val request = Request(
            input = input,
            init = jso {
                signal = continuation.toAbortSignal()
            }
        )

        fetchAsync(request)
            .thenTo(continuation)
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
