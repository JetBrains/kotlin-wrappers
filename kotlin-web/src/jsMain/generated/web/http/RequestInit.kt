// Automatically generated - do not modify!

package web.http

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable

@JsPlainObject
external interface RequestInit :
    Abortable {
    /**
     * A BodyInit object or null to set request's body.
     */
    val body: BodyInit?

    /**
     * A string indicating how the request will interact with the browser's cache to set request's cache.
     */
    val cache: RequestCache?

    /**
     * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
     */
    val credentials: RequestCredentials?

    /**
     * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
     */
    val headers: Headers?

    /**
     * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
     */
    val integrity: String?

    /**
     * A boolean to set request's keepalive.
     */
    val keepalive: Boolean?

    /**
     * A string to set request's method.
     */
    val method: RequestMethod?

    /**
     * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
     */
    val mode: RequestMode?
    val priority: RequestPriority?

    /**
     * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
     */
    val redirect: RequestRedirect?

    /**
     * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
     */
    val referrer: String?

    /**
     * A referrer policy to set request's referrerPolicy.
     */
    val referrerPolicy: ReferrerPolicy?

    /**
     * An AbortSignal to set request's signal.
     */
    override val signal: AbortSignal?
}
