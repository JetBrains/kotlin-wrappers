// Automatically generated - do not modify!

package tanstack.query.core

import seskar.js.JsValue

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
