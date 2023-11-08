@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.promise

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PromiseSettledResultStatus {
    companion object {
        @JsValue("fulfilled")
        val fulfilled: PromiseSettledResultStatus

        @JsValue("rejected")
        val rejected: PromiseSettledResultStatus
    }
}
