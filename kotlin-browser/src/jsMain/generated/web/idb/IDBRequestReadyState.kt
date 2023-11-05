// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface IDBRequestReadyState {
    companion object {
        @JsValue("done")
        val done: IDBRequestReadyState

        @JsValue("pending")
        val pending: IDBRequestReadyState
    }
}
