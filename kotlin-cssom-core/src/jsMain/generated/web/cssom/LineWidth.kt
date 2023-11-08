// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface LineWidth : LineWidthProperty {
    companion object {
        @JsValue("medium")
        val medium: LineWidth

        @JsValue("thick")
        val thick: LineWidth

        @JsValue("thin")
        val thin: LineWidth
    }
}
