// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PremultiplyAlpha {
    companion object {
        @JsValue("default")
        val default: PremultiplyAlpha

        @JsValue("none")
        val none: PremultiplyAlpha

        @JsValue("premultiply")
        val premultiply: PremultiplyAlpha
    }
}
