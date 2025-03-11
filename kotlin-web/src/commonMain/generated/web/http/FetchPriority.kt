// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsValue

sealed external interface FetchPriority {
    companion object {
        @JsValue("auto")
        val auto: FetchPriority

        @JsValue("high")
        val high: FetchPriority

        @JsValue("low")
        val low: FetchPriority
    }
}
