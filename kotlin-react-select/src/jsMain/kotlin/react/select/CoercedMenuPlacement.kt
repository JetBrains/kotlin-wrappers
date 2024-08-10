package react.select

import seskar.js.JsValue

sealed external interface CoercedMenuPlacement {
    companion object {
        @JsValue("bottom")
        val bottom: CoercedMenuPlacement

        @JsValue("top")
        val top: CoercedMenuPlacement
    }
}
