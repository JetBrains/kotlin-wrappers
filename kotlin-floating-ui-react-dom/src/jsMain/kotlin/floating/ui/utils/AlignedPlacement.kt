package floating.ui.utils

import seskar.js.JsValue

sealed /* union */
external interface AlignedPlacement {
    companion object {
        @JsValue("top-start")
        val topStart: AlignedPlacement

        @JsValue("top-end")
        val topEnd: AlignedPlacement

        @JsValue("right-start")
        val rightStart: AlignedPlacement

        @JsValue("right-end")
        val rightEnd: AlignedPlacement

        @JsValue("bottom-start")
        val bottomStart: AlignedPlacement

        @JsValue("bottom-end")
        val bottomEnd: AlignedPlacement

        @JsValue("left-start")
        val leftStart: AlignedPlacement

        @JsValue("left-end")
        val leftEnd: AlignedPlacement
    }
}
