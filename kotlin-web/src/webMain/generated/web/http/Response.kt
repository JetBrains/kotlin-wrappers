// Automatically generated - do not modify!

package web.http

import web.url.URL
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`Response`** interface of the Fetch API represents the response to a request.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response)
 */
open external class Response(
    body: BodyInit? = definedExternally,
    init: ResponseInit = definedExternally,
) : Body {
    /**
     * The **`headers`** read-only property of the Response interface contains the Headers object associated with the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/headers)
     */
    val headers: Headers

    /**
     * The **`ok`** read-only property of the Response interface contains a Boolean stating whether the response was successful (status in the range 200-299) or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/ok)
     */
    val ok: Boolean

    /**
     * The **`redirected`** read-only property of the Response interface indicates whether or not the response is the result of a request you made which was redirected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirected)
     */
    val redirected: Boolean

    /**
     * The **`status`** read-only property of the Response interface contains the HTTP status codes of the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/status)
     */
    val status: Short

    /**
     * The **`statusText`** read-only property of the Response interface contains the status message corresponding to the HTTP status code in Response.status.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/statusText)
     */
    val statusText: String

    /**
     * The **`type`** read-only property of the Response interface contains the type of the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type)
     */
    val type: ResponseType

    /**
     * The **`url`** read-only property of the Response interface contains the URL of the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/url)
     */
    val url: String

    /**
     * The **`clone()`** method of the Response interface creates a clone of a response object, identical in every way, but stored in a different variable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/clone)
     */
    fun clone(): Response

    companion object {
        /**
         * The **`error()`** static method of the Response interface returns a new `Response` object associated with a network error.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/error_static)
         */
        fun error(): Response

        /**
         * The **`json()`** static method of the Response interface returns a `Response` that contains the provided JSON data as body, and a Content-Type header which is set to `application/json`.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/json_static)
         */
        fun json(
            data: JsAny?,
            init: ResponseInit = definedExternally,
        ): Response

        /**
         * The **`redirect()`** static method of the Response interface returns a `Response` resulting in a redirect to the specified URL.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirect_static)
         */
        fun redirect(
            url: String,
            status: Short = definedExternally,
        ): Response

        fun redirect(
            url: URL,
            status: Short = definedExternally,
        ): Response
    }
}
