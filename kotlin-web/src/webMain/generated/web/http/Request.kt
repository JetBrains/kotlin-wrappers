// Automatically generated - do not modify!

package web.http

import web.abort.AbortSignal
import web.abort.AbortableLike
import web.url.URL
import kotlin.js.definedExternally

/**
 * The **`Request`** interface of the Fetch API represents a resource request.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request)
 */
open external class Request(
    /**
     * The **`url`** read-only property of the Request interface contains the URL of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/url)
     */
    val url: String,
    init: RequestInit = definedExternally,
) : Body,
    AbortableLike {
    constructor(
        url: URL,
        init: RequestInit = definedExternally,
    )

    constructor(
        request: Request,
        init: RequestInit = definedExternally,
    )

    /**
     * The **`cache`** read-only property of the Request interface contains the cache mode of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache)
     */
    val cache: RequestCache

    /**
     * The **`credentials`** read-only property of the Request interface reflects the value given to the Request.Request() constructor in the `credentials` option.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials)
     */
    val credentials: RequestCredentials

    /**
     * The **`destination`** read-only property of the **Request** interface returns a string describing the type of content being requested.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/destination)
     */
    val destination: RequestDestination

    /**
     * The **`headers`** read-only property of the Request interface contains the Headers object associated with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/headers)
     */
    val headers: Headers

    /**
     * The **`integrity`** read-only property of the Request interface contains the subresource integrity value of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/integrity)
     */
    val integrity: String

    /**
     * The **`keepalive`** read-only property of the Request interface contains the request's `keepalive` setting (`true` or `false`), which indicates whether the browser will keep the associated request alive if the page that initiated it is unloaded before the request is complete.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/keepalive)
     */
    val keepalive: Boolean

    /**
     * The **`method`** read-only property of the Request interface contains the request's method (`GET`, `POST`, etc.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/method)
     */
    val method: RequestMethod

    /**
     * The **`mode`** read-only property of the Request interface contains the mode of the request (e.g., `cors`, `no-cors`, `same-origin`, or `navigate`.) This is used to determine if cross-origin requests lead to valid responses, and which properties of the response are readable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode)
     */
    val mode: RequestMode

    /**
     * The **`redirect`** read-only property of the Request interface contains the mode for how redirects are handled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect)
     */
    val redirect: RequestRedirect

    /**
     * The **`referrer`** read-only property of the Request interface is set by the user agent to be the referrer of the Request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrer)
     */
    val referrer: String

    /**
     * The **`referrerPolicy`** read-only property of the Request interface returns the referrer policy, which governs what referrer information, sent in the Referer header, should be included with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrerPolicy)
     */
    val referrerPolicy: ReferrerPolicy

    /**
     * The read-only **`signal`** property of the Request interface returns the AbortSignal associated with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/signal)
     */
    override val signal: AbortSignal

    /**
     * The **`clone()`** method of the Request interface creates a copy of the current `Request` object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/clone)
     */
    fun clone(): Request
}
