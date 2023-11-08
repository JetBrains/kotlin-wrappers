// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.http.client

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Headers {
    companion object {
        @JsValue("accept")
        val Accept: Headers

        @JsValue("content-type")
        val ContentType: Headers
    }
}
