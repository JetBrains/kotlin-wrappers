// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * The **`RTCTransformEvent`** of the WebRTC API represent an event that is fired in a dedicated worker when an encoded frame has been queued for processing by a WebRTC Encoded Transform.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent)
 */
external class RTCTransformEvent
private constructor() :
    Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent/transformer)
     */
    val transformer: RTCRtpScriptTransformer

    companion object {
        @JsValue("rtctransform")
        val RTC_TRANSFORM: EventType<RTCTransformEvent>
    }
}
