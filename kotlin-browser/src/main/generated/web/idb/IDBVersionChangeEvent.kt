// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.idb

import web.events.Event
import web.events.EventInit

external interface IDBVersionChangeEventInit : EventInit {
    var newVersion: Int?
    var oldVersion: Int?
}

sealed external class IDBVersionChangeEvent : Event {
    companion object
}
