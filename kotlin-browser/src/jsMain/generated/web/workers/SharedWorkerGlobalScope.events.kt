// Automatically generated - do not modify!

package web.workers

import web.events.EventInstance
import web.messaging.MessageEvent

inline val <C : SharedWorkerGlobalScope> C.connectEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.connect())
