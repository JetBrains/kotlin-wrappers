// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.idb

import seskar.js.JsValue

sealed external interface IDBRequestReadyState {
    companion object {
        @JsValue("done")
        val done: IDBRequestReadyState

        @JsValue("pending")
        val pending: IDBRequestReadyState
    }
}
