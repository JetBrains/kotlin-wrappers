// Automatically generated - do not modify!

package media.key

import kotlinx.js.ArrayBuffer
import web.events.Event
import web.events.EventInit

external interface MediaKeyMessageEventInit : EventInit {
    var message: ArrayBuffer
    var messageType: MediaKeyMessageType
}

open external class MediaKeyMessageEvent(
    type: String,
    init: MediaKeyMessageEventInit,
) : Event {
    val message: ArrayBuffer
    val messageType: MediaKeyMessageType

    companion object
}
