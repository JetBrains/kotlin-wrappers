package web.http

import org.w3c.fetch.Response
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
