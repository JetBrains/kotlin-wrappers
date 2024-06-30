// Automatically generated - do not modify!

package web.serviceworker

import web.events.EventInstance
import web.events.EventType
import web.messaging.MessageEvent
import web.push.PushEvent

inline val <C : ServiceWorkerGlobalScope> C.activateEvent: EventInstance<ExtendableEvent, C, C>
    get() = EventInstance(this, EventType("activate"))

inline val <C : ServiceWorkerGlobalScope> C.fetchEvent: EventInstance<FetchEvent, C, C>
    get() = EventInstance(this, EventType("fetch"))

inline val <C : ServiceWorkerGlobalScope> C.messageEvent: EventInstance<ExtendableMessageEvent, C, C>
    get() = EventInstance(this, EventType("message"))

inline val <C : ServiceWorkerGlobalScope> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, EventType("messageerror"))

inline val <C : ServiceWorkerGlobalScope> C.notificationClickEvent: EventInstance<NotificationEvent, C, C>
    get() = EventInstance(this, EventType("notificationclick"))

inline val <C : ServiceWorkerGlobalScope> C.notificationCloseEvent: EventInstance<NotificationEvent, C, C>
    get() = EventInstance(this, EventType("notificationclose"))

inline val <C : ServiceWorkerGlobalScope> C.pushEvent: EventInstance<PushEvent, C, C>
    get() = EventInstance(this, EventType("push"))
