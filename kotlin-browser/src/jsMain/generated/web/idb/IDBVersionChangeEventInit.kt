// Automatically generated - do not modify!

package web.idb

import js.core.JsLong
import kotlinx.js.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface IDBVersionChangeEventInit :
    EventInit {
    val newVersion: JsLong?
    val oldVersion: JsLong?
}
