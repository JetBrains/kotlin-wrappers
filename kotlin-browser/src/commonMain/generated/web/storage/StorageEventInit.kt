// Automatically generated - do not modify!

package web.storage

import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface StorageEventInit :
    EventInit {
    var key: String?
    var newValue: String?
    var oldValue: String?
    var storageArea: Storage?
    var url: String?
}
