package floating.ui.utils

import seskar.js.JsValue

sealed /* union */
external interface Side {
    companion object {
        @JsValue("top")
        val top: Side

        @JsValue("right")
        val right: Side

        @JsValue("bottom")
        val bottom: Side

        @JsValue("left")
        val left: Side
    }
}
