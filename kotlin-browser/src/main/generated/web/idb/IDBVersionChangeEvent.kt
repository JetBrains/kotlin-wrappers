// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

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
    eventInitDict: IDBVersionChangeEventInit = definedExternally,
) : Event {
    val newVersion: JsLong?
    val oldVersion: JsLong

    companion object
}
