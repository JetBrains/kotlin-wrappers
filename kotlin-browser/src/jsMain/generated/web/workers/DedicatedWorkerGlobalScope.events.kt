// Automatically generated - do not modify!

package web.workers

import web.events.EventInstance
import web.messaging.MessageEvent
import web.rtc.RTCTransformEvent

inline val <C : DedicatedWorkerGlobalScope> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

inline val <C : DedicatedWorkerGlobalScope> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())

inline val <C : DedicatedWorkerGlobalScope> C.rtcTransformEvent: EventInstance<RTCTransformEvent, C, C>
    get() = EventInstance(this, RTCTransformEvent.rtcTransform())
