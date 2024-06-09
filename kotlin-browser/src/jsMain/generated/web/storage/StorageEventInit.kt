// Automatically generated - do not modify!

package web.storage

import kotlinx.js.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface StorageEventInit :
    EventInit {
    val key: String?
    val newValue: String?
    val oldValue: String?
    val storageArea: Storage?
    val url: String?
}
