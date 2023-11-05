// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
