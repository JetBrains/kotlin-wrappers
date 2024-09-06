// Automatically generated - do not modify!

package web.workers

import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/connect_event)
 */
inline val <C : SharedWorkerGlobalScope> C.connectEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.CONNECT)
