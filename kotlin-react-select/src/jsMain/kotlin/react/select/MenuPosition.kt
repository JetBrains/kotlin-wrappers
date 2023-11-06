@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MenuPosition {
    companion object {
        @JsValue("absolute")
        val absolute: MenuPosition

        @JsValue("fixed")
        val fixed: MenuPosition
    }
}
