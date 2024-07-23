package react.dom

import kotlinx.js.JsPlainObject
import web.http.CrossOrigin

@JsPlainObject
external interface PreloadModuleOptions {
    /**
     * @default "script"
     */
    val `as`: PreloadModuleAs
    val crossOrigin: CrossOrigin?
    val integrity: String?
    val nonce: String?
}
