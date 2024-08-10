// Automatically generated - do not modify!

package web.http

import js.promise.Promise
import web.url.URL

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
@JsName("fetch")
external fun fetchAsync(
    input: Request,
    init: RequestInit? = definedExternally,
): Promise<Response>

@JsName("fetch")
external fun fetchAsync(
    input: String,
    init: RequestInit? = definedExternally,
): Promise<Response>

@JsName("fetch")
external fun fetchAsync(
    input: URL,
    init: RequestInit? = definedExternally,
): Promise<Response>
