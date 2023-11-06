// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.events

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PointerType {
    companion object {
        @JsValue("mouse")
        val mouse: PointerType

        @JsValue("pen")
        val pen: PointerType

        @JsValue("touch")
        val touch: PointerType
    }
}
