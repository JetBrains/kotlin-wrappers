@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.beautiful.dnd

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface DroppableMode {
    companion object {
        @JsValue("standard")
        val standard: DroppableMode

        @JsValue("virtual")
        val virtual: DroppableMode
    }
}
