// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
