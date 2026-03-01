package floating.ui.utils

import seskar.js.JsValue

sealed /* union */
external interface Strategy {
    companion object {
        @JsValue("absolute")
        val absolute: Strategy

        @JsValue("fixed")
        val fixed: Strategy
    }
}
