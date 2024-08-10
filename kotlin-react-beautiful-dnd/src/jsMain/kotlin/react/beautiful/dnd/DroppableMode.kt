package react.beautiful.dnd

import seskar.js.JsValue

sealed external interface DroppableMode {
    companion object {
        @JsValue("standard")
        val standard: DroppableMode

        @JsValue("virtual")
        val virtual: DroppableMode
    }
}
