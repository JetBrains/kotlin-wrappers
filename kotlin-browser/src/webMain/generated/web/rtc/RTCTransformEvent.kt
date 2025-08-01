// Automatically generated - do not modify!

package web.rtc

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
     * The read-only **`transformer`** property of the RTCTransformEvent interface returns the RTCRtpScriptTransformer associated with the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent/transformer)
     */
    val transformer: RTCRtpScriptTransformer

    companion object
}

inline val RTCTransformEvent.Companion.RTC_TRANSFORM: EventType<RTCTransformEvent>
    get() = EventType("rtctransform")
