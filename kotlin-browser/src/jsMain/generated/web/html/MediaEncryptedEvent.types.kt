// Automatically generated - do not modify!

package web.html

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class MediaEncryptedEventTypes {

    @JsValue("encrypted")
    fun <C : EventTarget> encrypted(): EventType<MediaEncryptedEvent, C>
}
