// Automatically generated - do not modify!

package web.http

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
}
