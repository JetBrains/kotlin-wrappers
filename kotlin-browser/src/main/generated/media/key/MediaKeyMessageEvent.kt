// Automatically generated - do not modify!

package media.key

import js.buffer.ArrayBuffer
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MediaKeyMessageEventInit : EventInit {
    var message: ArrayBuffer
    var messageType: MediaKeyMessageType
}

open external class MediaKeyMessageEvent(
    type: EventType<MediaKeyMessageEvent>,
    init: MediaKeyMessageEventInit,
) : Event {
    val message: ArrayBuffer
    val messageType: MediaKeyMessageType

    companion object
}
