// Automatically generated - do not modify!

package web.http

import js.promise.Promise
import web.url.URL
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch)
 */
@JsName("fetch")
external fun fetchAsync(
    url: String,
    init: RequestInit? = definedExternally,
): Promise<Response>

@JsName("fetch")
external fun fetchAsync(
    url: URL,
    init: RequestInit? = definedExternally,
): Promise<Response>

@JsName("fetch")
external fun fetchAsync(
    request: Request,
    init: RequestInit? = definedExternally,
): Promise<Response>
