// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface RTCDTMFToneChangeEventInit : EventInit {
    var tone: String?
}

open external class RTCDTMFToneChangeEvent(
    type: EventType<RTCDTMFToneChangeEvent>,
    init: RTCDTMFToneChangeEventInit = definedExternally,
) : Event {
    val tone: String

    companion object
}
