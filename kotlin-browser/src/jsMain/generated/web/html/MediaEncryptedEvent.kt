// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.html

import js.buffer.ArrayBuffer
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent)
 */
open external class MediaEncryptedEvent(
    override val type: EventType<MediaEncryptedEvent, EventTarget>,
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

    companion object : MediaEncryptedEventTypes
}
