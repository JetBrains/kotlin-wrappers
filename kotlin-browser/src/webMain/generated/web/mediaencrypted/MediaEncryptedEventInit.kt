// Automatically generated - do not modify!

package web.mediaencrypted

import js.buffer.ArrayBuffer
import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/MediaEncryptedEvent#options)
 */
@JsPlainObject
external interface MediaEncryptedEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/MediaEncryptedEvent#initData)
     */
    var initData: ArrayBuffer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/MediaEncryptedEvent#initDataType)
     */
    var initDataType: String?
}
