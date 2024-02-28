// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import js.core.Void
import js.promise.Promise
import js.promise.PromiseLike
import web.events.EventTarget
import web.events.EventType
import web.http.Request
import web.http.Response

/**
 * This is the event type for fetch events dispatched on the service worker global scope. It contains information about the fetch, including the request and how the receiver will treat the response. It provides the event.respondWith() method, which allows us to provide a response to this fetch.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent)
 */
open external class FetchEvent<out C : EventTarget?>(
    override val type: EventType<FetchEvent<EventTarget>>,
    init: FetchEventInit,
) : ExtendableEvent<C>,
    FetchEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/clientId)
     */
    override val clientId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/handled)
     */
    override val handled: Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/preloadResponse)
     */
    override val preloadResponse: Promise<*>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/request)
     */
    override val request: Request

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/resultingClientId)
     */
    override val resultingClientId: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/respondWith)
     */
    fun respondWith(r: Response)
    fun respondWith(r: PromiseLike<Response>)

    companion object : FetchEventTypes
}
