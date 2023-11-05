// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface BackgroundPositionY {
    companion object {
        @JsValue("bottom")
        val bottom: BackgroundPositionY

        @JsValue("center")
        val center: BackgroundPositionY

        @JsValue("top")
        val top: BackgroundPositionY

        @JsValue("y-end")
        val yEnd: BackgroundPositionY

        @JsValue("y-start")
        val yStart: BackgroundPositionY
    }
}
