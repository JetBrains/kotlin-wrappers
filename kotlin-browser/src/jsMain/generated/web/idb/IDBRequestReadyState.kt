// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface IDBRequestReadyState {
    companion object {
        @JsValue("done")
        val done: IDBRequestReadyState

        @JsValue("pending")
        val pending: IDBRequestReadyState
    }
}
