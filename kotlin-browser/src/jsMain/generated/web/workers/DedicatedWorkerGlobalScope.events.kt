// Automatically generated - do not modify!

package web.workers

import web.events.EventInstance
import web.events.EventType
import web.messaging.MessageEvent
import web.rtc.RTCTransformEvent

inline val <C : DedicatedWorkerGlobalScope> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, EventType("message"))

inline val <C : DedicatedWorkerGlobalScope> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, EventType("messageerror"))

inline val <C : DedicatedWorkerGlobalScope> C.rtcTransformEvent: EventInstance<RTCTransformEvent, C, C>
    get() = EventInstance(this, EventType("rtctransform"))
