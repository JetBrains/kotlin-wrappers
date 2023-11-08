@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CoercedMenuPlacement {
    companion object {
        @JsValue("bottom")
        val bottom: CoercedMenuPlacement

        @JsValue("top")
        val top: CoercedMenuPlacement
    }
}
