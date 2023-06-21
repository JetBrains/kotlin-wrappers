// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.media.key

import js.buffer.ArrayBuffer
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MediaKeyMessageEventInit : EventInit {
    var message: ArrayBuffer
    var messageType: MediaKeyMessageType
}

open external class MediaKeyMessageEvent(
    override val type: EventType<MediaKeyMessageEvent>,
    init: MediaKeyMessageEventInit,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/message) */
    val message: ArrayBuffer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType) */
    val messageType: MediaKeyMessageType

    companion object
}
