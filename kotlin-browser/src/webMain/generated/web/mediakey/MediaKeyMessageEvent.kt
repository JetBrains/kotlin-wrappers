// Automatically generated - do not modify!

package web.mediakey

import js.buffer.ArrayBuffer
import web.events.Event
import web.events.EventType

/**
 * The **`MediaKeyMessageEvent`** interface of the Encrypted Media Extensions API contains the content and related data when the content decryption module generates a message for the session.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent)
 */
open external class MediaKeyMessageEvent(
    override val type: EventType<MediaKeyMessageEvent>,
    init: MediaKeyMessageEventInit,
) : Event {
    /**
     * The **`MediaKeyMessageEvent.message`** read-only property returns an ArrayBuffer with a message from the content decryption module. Messages vary by key system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/message)
     */
    val message: ArrayBuffer

    /**
     * The **`MediaKeyMessageEvent.messageType`** read-only property indicates the type of message. It may be one of license-request, license-renewal, license-release, or individualization-request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType)
     */
    val messageType: MediaKeyMessageType

    companion object
}

inline val MediaKeyMessageEvent.Companion.MESSAGE: EventType<MediaKeyMessageEvent>
    get() = EventType("message")
