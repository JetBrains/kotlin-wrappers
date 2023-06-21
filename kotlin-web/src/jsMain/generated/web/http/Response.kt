// Automatically generated - do not modify!

package web.http

import web.url.URL

external class Response(
    body: BodyInit? = definedExternally,
    init: ResponseInit = definedExternally,
) : Body {
    val headers: Headers
    val ok: Boolean
    val redirected: Boolean
    val status: Int
    val statusText: String
    val type: ResponseType
    val url: String
    fun clone(): Response

    companion object {
        fun error(): Response
        fun json(
            data: Any?,
            init: ResponseInit = definedExternally,
        ): Response

        fun redirect(
            url: String,
            status: Number = definedExternally,
        ): Response

        fun redirect(
            url: URL,
            status: Number = definedExternally,
        ): Response
    }
}
