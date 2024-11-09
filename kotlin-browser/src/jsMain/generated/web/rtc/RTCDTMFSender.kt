// Automatically generated - do not modify!

package web.rtc

import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender)
 */
external class RTCDTMFSender
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/canInsertDTMF)
     */
    val canInsertDTMF: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/tonechange_event)
     */
    var ontonechange: EventHandler<RTCDTMFToneChangeEvent, RTCDTMFSender, RTCDTMFSender>?

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

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/tonechange_event)
     */
    @JsEvent("tonechange")
    val toneChangeEvent: EventInstance<RTCDTMFToneChangeEvent, RTCDTMFSender /* this */, RTCDTMFSender /* this */>
}
