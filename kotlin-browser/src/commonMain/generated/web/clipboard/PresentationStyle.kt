// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.clipboard

import seskar.js.JsValue

sealed external interface PresentationStyle {
    companion object {
        @JsValue("attachment")
        val attachment: PresentationStyle

        @JsValue("inline")
        val inline: PresentationStyle

        @JsValue("unspecified")
        val unspecified: PresentationStyle
    }
}
