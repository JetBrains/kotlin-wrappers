package react.beautiful.dnd

import seskar.js.JsValue

sealed external interface Direction {
    companion object {
        @JsValue("horizontal")
        val horizontal: Direction

        @JsValue("vertical")
        val vertical: Direction
    }
}
