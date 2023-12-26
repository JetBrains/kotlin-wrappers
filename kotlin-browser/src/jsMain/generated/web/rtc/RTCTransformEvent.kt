// Automatically generated - do not modify!

package web.rtc

import web.events.Event

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent)
 */
sealed external class RTCTransformEvent : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent/transformer)
     */
    val transformer: RTCRtpScriptTransformer

    companion object : RTCTransformEventTypes
}
