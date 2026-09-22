package web.http

import js.resource.Resource
import web.abort.or
import web.abort.unsafeAbortable
import web.coroutines.awaitResource
import web.url.URLLike

typealias FetchResult = Resource<Response>

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    request: Request,
): FetchResult = awaitResource { signal ->
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
): FetchResult =
    fetch(Request(request, init))

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    url: String,
): FetchResult =
    fetch(Request(url))

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    url: String,
    init: RequestInit,
): FetchResult =
    fetch(Request(url, init))

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    url: URLLike,
): FetchResult =
    fetch(Request(url))

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
suspend fun fetch(
    url: URLLike,
    init: RequestInit,
): FetchResult =
    fetch(Request(url, init))
