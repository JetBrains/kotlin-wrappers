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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/StorageEvent#key)
     */
    var key: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/StorageEvent#newValue)
     */
    var newValue: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/StorageEvent#oldValue)
     */
    var oldValue: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/StorageEvent#storageArea)
     */
    var storageArea: Storage?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/StorageEvent#url)
     */
    var url: String?
}
