@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.promise

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PromiseSettledResultStatus {
    companion object {
        @JsValue("fulfilled")
        val fulfilled: PromiseSettledResultStatus

        @JsValue("rejected")
        val rejected: PromiseSettledResultStatus
    }
}
