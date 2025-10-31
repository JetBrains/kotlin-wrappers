// Automatically generated - do not modify!

package web.html

import js.buffer.ArrayBuffer
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`MediaEncryptedEvent`** interface of the Encrypted Media Extensions API contains the information associated with an HTMLMediaElement/encrypted_event event sent to a HTMLMediaElement when some initialization data is encountered in the media.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent)
 */
open external class MediaEncryptedEvent(
    override val type: EventType<MediaEncryptedEvent>,
    init: MediaEncryptedEventInit = definedExternally,
) : Event {
    /**
     * The read-only **`initData`** property of the MediaKeyMessageEvent returns the initialization data contained in this event, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/initData)
     */
    val initData: ArrayBuffer?

    /**
     * The read-only **`initDataType`** property of the MediaKeyMessageEvent returns a case-sensitive string describing the type of the initialization data associated with this event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/initDataType)
     */
    val initDataType: String

    companion object
}

inline val MediaEncryptedEvent.Companion.ENCRYPTED: EventType<MediaEncryptedEvent>
    get() = EventType("encrypted")
