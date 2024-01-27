package web.http

import js.promise.Promise
import web.url.URL

@JsName("fetch")
external fun fetchAsync(
    input: Request,
    init: RequestInit = definedExternally,
): Promise<Response>

@JsName("fetch")
external fun fetchAsync(
    input: String,
    init: RequestInit = definedExternally,
): Promise<Response>

@JsName("fetch")
external fun fetchAsync(
    input: URL,
    init: RequestInit = definedExternally,
): Promise<Response>
