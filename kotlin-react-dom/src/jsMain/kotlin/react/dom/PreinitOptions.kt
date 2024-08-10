package react.dom

import kotlinx.js.JsPlainObject
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
