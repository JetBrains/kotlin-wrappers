// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface RefactorTriggerReason {
    companion object {
        @JsValue("implicit")
        val implicit: RefactorTriggerReason

        @JsValue("invoked")
        val invoked: RefactorTriggerReason
    }
}
