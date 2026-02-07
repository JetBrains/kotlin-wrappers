// Automatically generated - do not modify!

package web.idb

import js.core.UInt53
import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/IDBVersionChangeEvent#options)
 */
@JsPlainObject
external interface IDBVersionChangeEventInit :
    EventInit {
    var newVersion: UInt53?
    var oldVersion: UInt53?
}
