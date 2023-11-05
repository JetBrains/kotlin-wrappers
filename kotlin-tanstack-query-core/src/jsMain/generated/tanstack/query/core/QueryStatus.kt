// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface QueryStatus {
    companion object {
        @JsValue("loading")
        val loading: QueryStatus

        @JsValue("error")
        val error: QueryStatus

        @JsValue("success")
        val success: QueryStatus
    }
}
