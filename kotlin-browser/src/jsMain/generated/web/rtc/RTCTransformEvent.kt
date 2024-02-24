// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent)
 */
sealed external class RTCTransformEvent<out C : EventTarget?> : Event<C> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTransformEvent/transformer)
     */
    val transformer: RTCRtpScriptTransformer

    companion object : RTCTransformEventTypes
}
