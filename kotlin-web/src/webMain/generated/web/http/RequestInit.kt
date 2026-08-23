// Automatically generated - do not modify!

package web.http

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit)
 */
@JsPlainObject
external interface RequestInit :
    Abortable {
    /**
     * A BodyInit object or null to set request's body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#body)
     */
    var body: BodyInit?

    /**
     * A string indicating how the request will interact with the browser's cache to set request's cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#cache)
     */
    var cache: RequestCache?

    /**
     * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#credentials)
     */
    var credentials: RequestCredentials?

    /**
     * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#headers)
     */
    var headers: HeadersInit?

    /**
     * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#integrity)
     */
    var integrity: String?

    /**
     * A boolean to set request's keepalive.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#keepalive)
     */
    var keepalive: Boolean?

    /**
     * A string to set request's method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#method)
     */
    var method: RequestMethod?

    /**
     * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#mode)
     */
    var mode: RequestMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#priority)
     */
    var priority: RequestPriority?

    /**
     * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#redirect)
     */
    var redirect: RequestRedirect?

    /**
     * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#referrer)
     */
    var referrer: String?

    /**
     * A referrer policy to set request's referrerPolicy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#referrerpolicy)
     */
    var referrerPolicy: ReferrerPolicy?

    /**
     * An AbortSignal to set request's signal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RequestInit#signal)
     */
    override var signal: AbortSignal?
}
