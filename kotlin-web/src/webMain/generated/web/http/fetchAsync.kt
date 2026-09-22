// Automatically generated - do not modify!

package web.http

import js.promise.Promise
import web.url.URLLike

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
@JsName("fetch")
external fun fetchAsync(
    url: String,
    init: RequestInit? = definedExternally,
): Promise<Response>

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
@JsName("fetch")
external fun fetchAsync(
    url: URLLike,
    init: RequestInit? = definedExternally,
): Promise<Response>

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
@JsName("fetch")
external fun fetchAsync(
    request: Request,
    init: RequestInit? = definedExternally,
): Promise<Response>
