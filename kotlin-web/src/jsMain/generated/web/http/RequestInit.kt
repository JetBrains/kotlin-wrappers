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
    var body: BodyInit?

    /**
     * A string indicating how the request will interact with the browser's cache to set request's cache.
     */
    var cache: RequestCache?

    /**
     * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
     */
    var credentials: RequestCredentials?

    /**
     * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
     */
    var headers: Headers?

    /**
     * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
     */
    var integrity: String?

    /**
     * A boolean to set request's keepalive.
     */
    var keepalive: Boolean?

    /**
     * A string to set request's method.
     */
    var method: RequestMethod?

    /**
     * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
     */
    var mode: RequestMode?
    var priority: RequestPriority?

    /**
     * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
     */
    var redirect: RequestRedirect?

    /**
     * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
     */
    var referrer: String?

    /**
     * A referrer policy to set request's referrerPolicy.
     */
    var referrerPolicy: ReferrerPolicy?

    /**
     * An AbortSignal to set request's signal.
     */
    override var signal: AbortSignal?
}
