// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CompositeOperationOrAuto {
    companion object {
        @JsValue("accumulate")
        val accumulate: CompositeOperationOrAuto

        @JsValue("add")
        val add: CompositeOperationOrAuto

        @JsValue("auto")
        val auto: CompositeOperationOrAuto

        @JsValue("replace")
        val replace: CompositeOperationOrAuto
    }
}
