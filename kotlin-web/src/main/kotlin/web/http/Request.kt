package web.http

import web.AbortSignal
import web.url.URL

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
