// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import js.core.Void
import js.promise.Promise
import web.events.EventType
import web.http.Request
import web.http.Response

external interface FetchEventInit : ExtendableEventInit {
    var clientId: String?
    var handled: Promise<Void>?
    var preloadResponse: Promise<*>?
    var replacesClientId: String?
    var request: Request
    var resultingClientId: String?
}

/**
 * This is the event type for fetch events dispatched on the service worker global scope. It contains information about the fetch, including the request and how the receiver will treat the response. It provides the event.respondWith() method, which allows us to provide a response to this fetch.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent)
 */
open external class FetchEvent(
    override val type: EventType<FetchEvent>,
    init: FetchEventInit,
) : ExtendableEvent {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/clientId) */
    val clientId: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/handled) */
    val handled: Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/preloadResponse) */
    val preloadResponse: Promise<*>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/request) */
    val request: Request

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/resultingClientId) */
    val resultingClientId: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/respondWith) */
    fun respondWith(r: Response)
    fun respondWith(r: Promise<Response>)

    companion object
}
