// Automatically generated - do not modify!

package web.http

import web.url.URL

external class Response(
    body: BodyInit? = definedExternally,
    init: ResponseInit = definedExternally,
) : Body {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/headers) */
    val headers: Headers

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/ok) */
    val ok: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirected) */
    val redirected: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/status) */
    val status: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/statusText) */
    val statusText: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type) */
    val type: ResponseType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/url) */
    val url: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/clone) */
    fun clone(): Response

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/error_static) */
        fun error(): Response

        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/json_static) */
        fun json(
            data: Any?,
            init: ResponseInit = definedExternally,
        ): Response

        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirect_static) */
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
