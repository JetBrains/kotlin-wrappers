@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
