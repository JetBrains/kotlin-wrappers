// Automatically generated - do not modify!

package serviceworkers

import js.core.Void
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
    type: String,
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
