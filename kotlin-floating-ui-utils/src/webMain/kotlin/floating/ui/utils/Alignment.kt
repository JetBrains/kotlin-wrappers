package floating.ui.utils

import seskar.js.JsValue

sealed /* union */
external interface Alignment {
    companion object {
        @JsValue("start")
        val start: Alignment

        @JsValue("end")
        val end: Alignment
    }
}
