// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package popper.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Placement {
    companion object {
        @JsValue("auto")
        val auto: Placement

        @JsValue("auto-start")
        val autoStart: Placement

        @JsValue("auto-end")
        val autoEnd: Placement

        @JsValue("top")
        val top: Placement

        @JsValue("top-start")
        val topStart: Placement

        @JsValue("top-end")
        val topEnd: Placement

        @JsValue("bottom")
        val bottom: Placement

        @JsValue("bottom-start")
        val bottomStart: Placement

        @JsValue("bottom-end")
        val bottomEnd: Placement

        @JsValue("right")
        val right: Placement

        @JsValue("right-start")
        val rightStart: Placement

        @JsValue("right-end")
        val rightEnd: Placement

        @JsValue("left")
        val left: Placement

        @JsValue("left-start")
        val leftStart: Placement

        @JsValue("left-end")
        val leftEnd: Placement
    }
}
