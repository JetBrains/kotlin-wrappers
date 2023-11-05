// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TextOrientation {
    companion object {
        @JsValue("mixed")
        val mixed: TextOrientation

        @JsValue("sideways")
        val sideways: TextOrientation

        @JsValue("upright")
        val upright: TextOrientation
    }
}
