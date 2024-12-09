package react.dom

import js.objects.JsPlainObject
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
