// Automatically generated - do not modify!

package web.idb

import kotlinx.js.JsLong
import web.events.Event
import web.events.EventInit

external interface IDBVersionChangeEventInit : EventInit {
    var newVersion: JsLong?
    var oldVersion: JsLong?
}

open external class IDBVersionChangeEvent(
    type: String,
    init: IDBVersionChangeEventInit = definedExternally,
) : Event {
    val newVersion: JsLong?
    val oldVersion: JsLong

    companion object
}
