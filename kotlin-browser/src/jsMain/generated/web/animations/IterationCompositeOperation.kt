// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface IterationCompositeOperation {
    companion object {
        @JsValue("accumulate")
        val accumulate: IterationCompositeOperation

        @JsValue("replace")
        val replace: IterationCompositeOperation
    }
}
