package floating.ui.utils

import seskar.js.JsValue

sealed /* union */
external interface Axis {
    companion object {
        @JsValue("x")
        val x: Axis

        @JsValue("y")
        val y: Axis
    }
}
