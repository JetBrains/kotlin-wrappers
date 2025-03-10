// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
