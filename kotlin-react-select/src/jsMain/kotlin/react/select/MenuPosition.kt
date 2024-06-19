package react.select

import seskar.js.JsValue

sealed external interface MenuPosition {
    companion object {
        @JsValue("absolute")
        val absolute: MenuPosition

        @JsValue("fixed")
        val fixed: MenuPosition
    }
}
