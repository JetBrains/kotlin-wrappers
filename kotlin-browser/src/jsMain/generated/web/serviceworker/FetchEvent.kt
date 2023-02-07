// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.serviceworker

import js.core.Void
import web.events.EventType
import web.http.Request
import web.http.Response
import kotlin.js.Promise

external interface FetchEventInit : ExtendableEventInit {
    var clientId: String?
    var handled: Promise<Void>?
    var preloadResponse: Promise<*>?
    var replacesClientId: String?
    var request: Request
    var resultingClientId: String?
}

open external class FetchEvent(
    override val type: EventType<FetchEvent>,
    init: FetchEventInit,
) : ExtendableEvent {
    val clientId: String
    val handled: Promise<Void>
    val preloadResponse: Promise<*>
    val request: Request
    val resultingClientId: String
    fun respondWith(r: Response)
    fun respondWith(r: Promise<Response>)

    companion object
}
