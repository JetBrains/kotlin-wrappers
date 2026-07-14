package web.http

import web.abort.or
import web.abort.unsafeAbortable
import web.coroutines.await
import web.url.URL

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
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

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    request: Request,
    init: RequestInit,
): Response =
    fetch(Request(request, init))

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    url: String,
): Response =
    fetch(Request(url))

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    url: String,
    init: RequestInit,
): Response =
    fetch(Request(url, init))

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    url: URL,
): Response =
    fetch(Request(url))

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    url: URL,
    init: RequestInit,
): Response =
    fetch(Request(url, init))
