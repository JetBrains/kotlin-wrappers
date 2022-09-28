package web.http

import web.url.URL
import kotlin.js.Promise

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
