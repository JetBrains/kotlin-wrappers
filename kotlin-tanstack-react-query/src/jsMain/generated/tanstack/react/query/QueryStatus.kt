// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.react.query

import seskar.js.JsValue
import seskar.js.JsVirtual
import tanstack.query.core.QueryStatus

@JsVirtual
sealed external interface QueryStatus {
    companion object {
        @JsValue("pending")
        val pending: QueryStatus

        @JsValue("error")
        val error: QueryStatus

        @JsValue("success")
        val success: QueryStatus
    }
}
