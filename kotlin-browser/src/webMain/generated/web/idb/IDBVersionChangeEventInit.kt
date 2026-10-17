// Automatically generated - do not modify!

package web.idb

import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/IDBVersionChangeEvent#options)
 */
@JsPlainObject
external interface IDBVersionChangeEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/IDBVersionChangeEvent#newVersion)
     */
    var newVersion: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/IDBVersionChangeEvent#oldVersion)
     */
    var oldVersion: UInt53?
}
