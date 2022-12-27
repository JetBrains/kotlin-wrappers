// Automatically generated - do not modify!

package web.idb

import js.core.JsLong
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface IDBVersionChangeEventInit : EventInit {
    var newVersion: JsLong?
    var oldVersion: JsLong?
}

open external class IDBVersionChangeEvent(
    type: EventType<IDBVersionChangeEvent>,
    init: IDBVersionChangeEventInit = definedExternally,
) : Event {
    val newVersion: JsLong?
    val oldVersion: JsLong

    companion object
}
