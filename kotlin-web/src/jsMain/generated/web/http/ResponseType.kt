// Automatically generated - do not modify!

package web.http

import seskar.js.JsValue

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
