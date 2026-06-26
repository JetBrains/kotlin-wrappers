package web.http

import web.abort.or
import web.abort.unsafeAbortable
import web.coroutines.await
import web.url.URL

suspend fun fetch(
    request: Request,
): Response = await { signal ->
    fetchAsync(
        Request(
            request = request,
            init = unsafeAbortable(
                signal = request.signal or signal,
            ),
        ),
    )
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
