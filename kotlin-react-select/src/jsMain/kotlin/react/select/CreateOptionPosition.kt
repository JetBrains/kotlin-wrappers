@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CreateOptionPosition {
    companion object {
        @JsValue("first")
        val first: CreateOptionPosition

        @JsValue("last")
        val last: CreateOptionPosition
    }
}
