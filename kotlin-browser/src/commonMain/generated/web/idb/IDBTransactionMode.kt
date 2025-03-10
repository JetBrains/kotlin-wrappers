// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.idb

import seskar.js.JsValue

sealed external interface IDBTransactionMode {
    companion object {
        @JsValue("readonly")
        val readonly: IDBTransactionMode

        @JsValue("readwrite")
        val readwrite: IDBTransactionMode

        @JsValue("versionchange")
        val versionchange: IDBTransactionMode
    }
}
