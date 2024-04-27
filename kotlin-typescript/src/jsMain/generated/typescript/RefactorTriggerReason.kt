// Automatically generated - do not modify!

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RefactorTriggerReason {
    companion object {
        @JsValue("implicit")
        val implicit: RefactorTriggerReason

        @JsValue("invoked")
        val invoked: RefactorTriggerReason
    }
}
