package react.dom

import kotlinx.js.JsPlainObject
import web.http.CrossOrigin

@JsPlainObject
external interface PreinitModuleOptions {
    /**
     * @default "script"
     */
    val `as`: PreinitModuleAs
    val crossOrigin: CrossOrigin?
    val integrity: String?
    val nonce: String?
}
