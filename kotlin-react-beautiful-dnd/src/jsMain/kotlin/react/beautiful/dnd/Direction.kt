@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.beautiful.dnd

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Direction {
    companion object {
        @JsValue("horizontal")
        val horizontal: Direction

        @JsValue("vertical")
        val vertical: Direction
    }
}
