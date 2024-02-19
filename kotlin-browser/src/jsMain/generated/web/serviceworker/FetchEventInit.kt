// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.objects.JsPlainObject
import js.promise.Promise
import web.http.Request

@JsPlainObject
external interface FetchEventInit :
    ExtendableEventInit {
    val clientId: String?
    val handled: Promise<Void>?
    val preloadResponse: Promise<*>?
    val request: Request
    val resultingClientId: String?
}
