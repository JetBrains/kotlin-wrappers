package kotlinx.js

import org.w3c.dom.url.URL

@JsName("fetch")
external fun fetchAsync(
    input: String,
    init: RequestInit = definedExternally,
)

@JsName("fetch")
external fun fetchAsync(
    input: URL,
    init: RequestInit = definedExternally,
)

@JsName("fetch")
external fun fetchAsync(
    input: Request,
    init: RequestInit = definedExternally,
)
