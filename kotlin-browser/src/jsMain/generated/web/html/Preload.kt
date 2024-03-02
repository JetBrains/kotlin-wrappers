// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Preload {
    companion object {
        @JsValue("none")
        val none: Preload

        @JsValue("metadata")
        val metadata: Preload

        @JsValue("auto")
        val auto: Preload
    }
}
