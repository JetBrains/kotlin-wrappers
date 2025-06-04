// Automatically generated - do not modify!

package web.rtc

import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent
import kotlin.js.definedExternally

/**
 * The **`RTCDTMFSender`** interface provides a mechanism for transmitting DTMF codes on a WebRTC RTCPeerConnection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender)
 */
external class RTCDTMFSender
private constructor() :
    EventTarget {
    /**
     * The **`canInsertDTMF`** read-only property of the RTCDTMFSender interface returns a boolean value which indicates whether the `RTCDTMFSender` is capable of sending DTMF tones over the RTCPeerConnection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/canInsertDTMF)
     */
    val canInsertDTMF: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/tonechange_event)
     */
    var ontonechange: EventHandler<RTCDTMFToneChangeEvent, RTCDTMFSender, RTCDTMFSender>?

    /**
     * The RTCDTMFSender interface's toneBuffer property returns a string containing a list of the DTMF tones currently queued for sending to the remote peer over the RTCPeerConnection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/toneBuffer)
     */
    val toneBuffer: String

    /**
     * The **`insertDTMF()`** method of the RTCDTMFSender interface sends DTMF tones to the remote peer over the RTCPeerConnection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/insertDTMF)
     */
    fun insertDTMF(
        tones: String,
        duration: Int = definedExternally,
        interToneGap: Int = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/tonechange_event)
     */
    @JsEvent("tonechange")
    val toneChangeEvent: EventInstance<RTCDTMFToneChangeEvent, RTCDTMFSender /* this */, RTCDTMFSender /* this */>
}
