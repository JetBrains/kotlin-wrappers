// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent)
 */
sealed external class RTCTransformEvent : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent/transformer)
     */
    val transformer: RTCRtpScriptTransformer

    companion object {
        @JsValue("rtctransform")
        val RTC_TRANSFORM: EventType<RTCTransformEvent>
    }
}
