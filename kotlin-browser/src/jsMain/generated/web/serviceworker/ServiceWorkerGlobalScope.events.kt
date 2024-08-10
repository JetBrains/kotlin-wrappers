// Automatically generated - do not modify!

package web.serviceworker

import web.events.EventInstance
import web.messaging.MessageEvent
import web.push.PushEvent

inline val <C : ServiceWorkerGlobalScope> C.activateEvent: EventInstance<ExtendableEvent, C, C>
    get() = EventInstance(this, ExtendableEvent.activate())

inline val <C : ServiceWorkerGlobalScope> C.fetchEvent: EventInstance<FetchEvent, C, C>
    get() = EventInstance(this, FetchEvent.fetch())

inline val <C : ServiceWorkerGlobalScope> C.messageEvent: EventInstance<ExtendableMessageEvent, C, C>
    get() = EventInstance(this, ExtendableMessageEvent.message())

inline val <C : ServiceWorkerGlobalScope> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.messageError())

inline val <C : ServiceWorkerGlobalScope> C.notificationClickEvent: EventInstance<NotificationEvent, C, C>
    get() = EventInstance(this, NotificationEvent.notificationClick())

inline val <C : ServiceWorkerGlobalScope> C.notificationCloseEvent: EventInstance<NotificationEvent, C, C>
    get() = EventInstance(this, NotificationEvent.notificationClose())

inline val <C : ServiceWorkerGlobalScope> C.pushEvent: EventInstance<PushEvent, C, C>
    get() = EventInstance(this, PushEvent.push())
