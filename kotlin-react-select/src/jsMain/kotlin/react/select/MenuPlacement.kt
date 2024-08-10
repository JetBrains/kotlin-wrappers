package react.select

import seskar.js.JsValue

sealed external interface MenuPlacement {
    companion object {
        @JsValue("auto")
        val auto: MenuPlacement

        @JsValue("bottom")
        val bottom: MenuPlacement

        @JsValue("top")
        val top: MenuPlacement
    }
}
