package floating.ui.utils

import seskar.js.JsValue

sealed /* union */
external interface Placement {
    companion object {
        @JsValue("top")
        val top: Placement

        @JsValue("top-start")
        val topStart: Placement

        @JsValue("top-end")
        val topEnd: Placement

        @JsValue("right")
        val right: Placement

        @JsValue("right-start")
        val rightStart: Placement

        @JsValue("right-end")
        val rightEnd: Placement

        @JsValue("bottom")
        val bottom: Placement

        @JsValue("bottom-start")
        val bottomStart: Placement

        @JsValue("bottom-end")
        val bottomEnd: Placement

        @JsValue("left")
        val left: Placement

        @JsValue("left-start")
        val leftStart: Placement

        @JsValue("left-end")
        val leftEnd: Placement
    }
}
