// Automatically generated - do not modify!

package web.storage

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/StorageEvent#options)
 */
@JsPlainObject
external interface StorageEventInit :
    EventInit {
    var key: String?
    var newValue: String?
    var oldValue: String?
    var storageArea: Storage?
    var url: String?
}
