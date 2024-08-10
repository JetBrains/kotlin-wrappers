// Automatically generated - do not modify!

package tanstack.query.core

import seskar.js.JsValue

sealed external interface MutationStatus {
    companion object {
        @JsValue("idle")
        val idle: MutationStatus

        @JsValue("pending")
        val pending: MutationStatus

        @JsValue("success")
        val success: MutationStatus

        @JsValue("error")
        val error: MutationStatus
    }
}
