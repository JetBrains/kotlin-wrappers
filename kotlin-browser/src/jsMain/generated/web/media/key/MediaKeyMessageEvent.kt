// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.media.key

import js.buffer.ArrayBuffer
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * This EncryptedMediaExtensions API interface contains the content and related data when the content decryption module generates a message for the session.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent)
 */
open external class MediaKeyMessageEvent(
    override val type: EventType<MediaKeyMessageEvent, EventTarget>,
    init: MediaKeyMessageEventInit,
) : Event,
    MediaKeyMessageEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/message)
     */
    override val message: ArrayBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType)
     */
    override val messageType: MediaKeyMessageType

    companion object : MediaKeyMessageEventTypes
}
