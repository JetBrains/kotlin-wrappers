// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CompositeOperation {
    companion object {
        @JsValue("accumulate")
        val accumulate: CompositeOperation

        @JsValue("add")
        val add: CompositeOperation

        @JsValue("replace")
        val replace: CompositeOperation
    }
}
