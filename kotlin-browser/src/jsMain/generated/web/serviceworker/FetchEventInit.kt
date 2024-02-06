// Automatically generated - do not modify!

package web.serviceworker

import js.core.Void
import js.promise.Promise
import web.http.Request

external interface FetchEventInit : ExtendableEventInit {
    var clientId: String?
    var handled: Promise<Void>?
    var preloadResponse: Promise<*>?
    var replacesClientId: String?
    var request: Request
    var resultingClientId: String?
}
