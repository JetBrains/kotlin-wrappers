package react.dom

import js.objects.JsPlainObject
import web.http.CrossOrigin
import web.http.FetchPriority

@JsPlainObject
external interface PreinitOptions {
    val `as`: PreinitAs
    val crossOrigin: CrossOrigin?
    val fetchPriority: FetchPriority?
    val precedence: String?
    val integrity: String?
    val nonce: String?
}
