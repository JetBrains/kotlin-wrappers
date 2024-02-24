// Automatically generated - do not modify!

package web.rtc

import web.events.EventHandler
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender)
 */
sealed external class RTCDTMFSender :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/canInsertDTMF)
     */
    val canInsertDTMF: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/tonechange_event)
     */
    var ontonechange: EventHandler<RTCDTMFToneChangeEvent<RTCDTMFSender>>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/toneBuffer)
     */
    val toneBuffer: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/insertDTMF)
     */
    fun insertDTMF(
        tones: String,
        duration: Int = definedExternally,
        interToneGap: Int = definedExternally,
    )
}
