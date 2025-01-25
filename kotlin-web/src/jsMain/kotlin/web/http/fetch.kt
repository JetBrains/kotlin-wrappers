package web.http

import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.toAbortSignal
import web.url.URL

suspend fun fetch(
    request: Request,
): Response =
    suspendCancellableCoroutine { continuation ->
        val finalRequest = Request(
            request = request,
            init = RequestInit(signal = continuation.toAbortSignal())
        )

        fetchAsync(finalRequest)
            .thenTo(continuation)
    }

suspend fun fetch(
    request: Request,
    init: RequestInit,
): Response =
    fetch(Request(request, init))

suspend fun fetch(
    url: String,
): Response =
    fetch(Request(url))

suspend fun fetch(
    url: String,
    init: RequestInit,
): Response =
    fetch(Request(url, init))

suspend fun fetch(
    url: URL,
): Response =
    fetch(Request(url))

suspend fun fetch(
    url: URL,
    init: RequestInit,
): Response =
    fetch(Request(url, init))
