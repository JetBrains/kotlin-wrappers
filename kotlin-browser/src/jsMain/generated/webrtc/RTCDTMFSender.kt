// Automatically generated - do not modify!

package webrtc

import web.events.EventHandler
import web.events.EventTarget

sealed external class RTCDTMFSender :
    EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/canInsertDTMF) */
    val canInsertDTMF: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/tonechange_event) */
    var ontonechange: EventHandler<RTCDTMFToneChangeEvent>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/toneBuffer) */
    val toneBuffer: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/insertDTMF) */
    fun insertDTMF(
        tones: String,
        duration: Number = definedExternally,
        interToneGap: Number = definedExternally,
    )
}
