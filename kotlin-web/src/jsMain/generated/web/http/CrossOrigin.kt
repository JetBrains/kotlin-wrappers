// Automatically generated - do not modify!

package web.http

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CrossOrigin {
    companion object {
        @JsValue("anonymous")
        val anonymous: CrossOrigin

        @JsValue("use-credentials")
        val useCredentials: CrossOrigin

        @JsValue("")
        val none: CrossOrigin
    }
}
