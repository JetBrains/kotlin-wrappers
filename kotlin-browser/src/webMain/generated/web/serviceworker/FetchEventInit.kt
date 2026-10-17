// Automatically generated - do not modify!

package web.serviceworker

import js.promise.Promise
import js.void.Void
import kotlinx.js.JsPlainObject
import web.http.Request

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/FetchEvent#options)
 */
@JsPlainObject
external interface FetchEventInit :
    ExtendableEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/FetchEvent#clientId)
     */
    var clientId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/FetchEvent#handled)
     */
    var handled: Promise<Void>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/FetchEvent#preloadResponse)
     */
    var preloadResponse: Promise<*>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/FetchEvent#request)
     */
    var request: Request

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/FetchEvent#resultingClientId)
     */
    var resultingClientId: String?
}
