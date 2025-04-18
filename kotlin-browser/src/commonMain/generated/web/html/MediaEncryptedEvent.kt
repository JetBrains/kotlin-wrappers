// Automatically generated - do not modify!

package web.html

import js.buffer.ArrayBuffer
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/initData)
     */
    val initData: ArrayBuffer?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/initDataType)
     */
    val initDataType: String

    @JsAlias(THIS)
    override fun asInit(): MediaEncryptedEventInit

    companion object {
        @JsValue("encrypted")
        val ENCRYPTED: EventType<MediaEncryptedEvent>
    }
}
