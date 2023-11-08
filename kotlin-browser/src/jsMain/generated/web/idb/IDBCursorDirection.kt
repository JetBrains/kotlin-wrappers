// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface IDBCursorDirection {
    companion object {
        @JsValue("next")
        val next: IDBCursorDirection

        @JsValue("nextunique")
        val nextunique: IDBCursorDirection

        @JsValue("prev")
        val prev: IDBCursorDirection

        @JsValue("prevunique")
        val prevunique: IDBCursorDirection
    }
}
