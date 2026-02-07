package react.dom

import kotlinx.js.JsPlainObject
import web.http.CrossOrigin
import web.http.FetchPriority
import web.http.ReferrerPolicy

@JsPlainObject
external interface PreloadOptions {
    val `as`: PreloadAs
    val crossOrigin: CrossOrigin?
    val fetchPriority: FetchPriority?

    // TODO: These should only be allowed with `as: 'image'` but it's not trivial to write tests against the full TS support matrix.
    val imageSizes: String?
    val imageSrcSet: String?
    val integrity: String?
    val type: String?
    val nonce: String?
    val referrerPolicy: ReferrerPolicy?
}
