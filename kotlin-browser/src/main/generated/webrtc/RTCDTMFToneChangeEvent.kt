// Automatically generated - do not modify!

package webrtc

import web.events.Event
import web.events.EventInit

external interface RTCDTMFToneChangeEventInit : EventInit {
    var tone: String?
}

open external class RTCDTMFToneChangeEvent(
    type: String,
    init: RTCDTMFToneChangeEventInit = definedExternally,
) : Event {
    val tone: String

    companion object
}
