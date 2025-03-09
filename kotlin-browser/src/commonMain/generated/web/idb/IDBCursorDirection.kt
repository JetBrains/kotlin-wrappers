// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue

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
