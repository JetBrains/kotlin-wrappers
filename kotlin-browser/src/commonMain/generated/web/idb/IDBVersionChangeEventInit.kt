// Automatically generated - do not modify!

package web.idb

import js.core.UInt53
import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface IDBVersionChangeEventInit :
    EventInit {
    val newVersion: UInt53?
    val oldVersion: UInt53?
}
