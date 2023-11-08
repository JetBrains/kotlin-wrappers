// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ResponseType {
    companion object {
        @JsValue("basic")
        val basic: ResponseType

        @JsValue("cors")
        val cors: ResponseType

        @JsValue("default")
        val default: ResponseType

        @JsValue("error")
        val error: ResponseType

        @JsValue("opaque")
        val opaque: ResponseType

        @JsValue("opaqueredirect")
        val opaqueredirect: ResponseType
    }
}
