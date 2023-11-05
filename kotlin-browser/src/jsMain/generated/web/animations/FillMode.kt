// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FillMode {
    companion object {
        @JsValue("auto")
        val auto: FillMode

        @JsValue("backwards")
        val backwards: FillMode

        @JsValue("both")
        val both: FillMode

        @JsValue("forwards")
        val forwards: FillMode

        @JsValue("none")
        val none: FillMode
    }
}
