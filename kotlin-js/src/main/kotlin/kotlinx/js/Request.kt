package kotlinx.js

import org.w3c.dom.url.URL

external class Request : org.w3c.fetch.Request {
    constructor(
        input: String,
        init: RequestInit = definedExternally,
    )

    constructor(
        input: URL,
        init: RequestInit = definedExternally,
    )

    constructor(
        input: Request,
        init: RequestInit = definedExternally,
    )

    val signal: AbortSignal
}
