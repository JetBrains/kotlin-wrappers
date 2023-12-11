// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RequestPriority {
    companion object {
        @JsValue("auto")
        val auto: RequestPriority

        @JsValue("high")
        val high: RequestPriority

        @JsValue("low")
        val low: RequestPriority
    }
}
