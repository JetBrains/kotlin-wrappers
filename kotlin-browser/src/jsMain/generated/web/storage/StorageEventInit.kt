// Automatically generated - do not modify!

package web.storage

import web.events.EventInit

external interface StorageEventInit :
    EventInit {
    val key: String?
    val newValue: String?
    val oldValue: String?
    val storageArea: Storage?
    val url: String?
}
