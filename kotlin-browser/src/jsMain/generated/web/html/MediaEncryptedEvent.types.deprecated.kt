// Automatically generated - do not modify!

package web.html

import seskar.js.JsValue
import web.events.EventType

sealed external class MediaEncryptedEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("MediaEncryptedEvent.ENCRYPTED"),
    )
    @JsValue("encrypted")
    fun encrypted(): EventType<MediaEncryptedEvent>
}
