package web.http

import js.objects.unsafeJso
import web.abort.AbortController
import web.abort.internal.awaitCancellable
import web.abort.internal.or
import web.url.URL

suspend fun fetch(
    request: Request,
): Response {
    val controller = AbortController()
    return fetchAsync(
        Request(
            request = request,
            init = unsafeJso {
                signal = request.signal or controller.signal
            },
        ),
    ).awaitCancellable(controller)
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
