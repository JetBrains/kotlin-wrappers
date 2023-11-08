// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MutationStatus {
    companion object {
        @JsValue("idle")
        val idle: MutationStatus

        @JsValue("loading")
        val loading: MutationStatus

        @JsValue("success")
        val success: MutationStatus

        @JsValue("error")
        val error: MutationStatus
    }
}
