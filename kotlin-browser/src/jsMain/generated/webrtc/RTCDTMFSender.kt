// Automatically generated - do not modify!

package webrtc

import web.events.EventHandler
import web.events.EventTarget

sealed external class RTCDTMFSender :
    EventTarget {
    val canInsertDTMF: Boolean
    var ontonechange: EventHandler<RTCDTMFToneChangeEvent>?
    val toneBuffer: String
    fun insertDTMF(
        tones: String,
        duration: Number = definedExternally,
        interToneGap: Number = definedExternally,
    )
}
