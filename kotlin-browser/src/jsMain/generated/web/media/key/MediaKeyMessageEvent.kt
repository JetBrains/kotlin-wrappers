// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.media.key

import js.buffer.ArrayBuffer
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * This EncryptedMediaExtensions API interface contains the content and related data when the content decryption module generates a message for the session.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent)
 */
open external class MediaKeyMessageEvent(
    override val type: EventType<MediaKeyMessageEvent>,
    init: MediaKeyMessageEventInit,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/message)
     */
    val message: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType)
     */
    val messageType: MediaKeyMessageType

    @JsAlias(THIS)
    override fun asInit(): MediaKeyMessageEventInit

    companion object {
        @JsValue("message")
        val MESSAGE: EventType<MediaKeyMessageEvent>
    }
}
