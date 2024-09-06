// Automatically generated - do not modify!

package web.workers

import web.events.EventInstance
import web.messaging.MessageEvent
import web.rtc.RTCTransformEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/message_event)
 */
inline val <C : DedicatedWorkerGlobalScope> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.MESSAGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/messageerror_event)
 */
inline val <C : DedicatedWorkerGlobalScope> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.MESSAGE_ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/rtctransform_event)
 */
inline val <C : DedicatedWorkerGlobalScope> C.rtcTransformEvent: EventInstance<RTCTransformEvent, C, C>
    get() = EventInstance(this, RTCTransformEvent.RTC_TRANSFORM)
