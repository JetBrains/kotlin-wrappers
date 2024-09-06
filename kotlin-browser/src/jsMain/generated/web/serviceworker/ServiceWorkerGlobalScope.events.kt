// Automatically generated - do not modify!

package web.serviceworker

import web.events.EventInstance
import web.messaging.MessageEvent
import web.push.PushEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/activate_event)
 */
inline val <C : ServiceWorkerGlobalScope> C.activateEvent: EventInstance<ExtendableEvent, C, C>
    get() = EventInstance(this, ExtendableEvent.ACTIVATE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/fetch_event)
 */
inline val <C : ServiceWorkerGlobalScope> C.fetchEvent: EventInstance<FetchEvent, C, C>
    get() = EventInstance(this, FetchEvent.FETCH)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/message_event)
 */
inline val <C : ServiceWorkerGlobalScope> C.messageEvent: EventInstance<ExtendableMessageEvent, C, C>
    get() = EventInstance(this, ExtendableMessageEvent.MESSAGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/messageerror_event)
 */
inline val <C : ServiceWorkerGlobalScope> C.messageErrorEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.MESSAGE_ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclick_event)
 */
inline val <C : ServiceWorkerGlobalScope> C.notificationClickEvent: EventInstance<NotificationEvent, C, C>
    get() = EventInstance(this, NotificationEvent.NOTIFICATION_CLICK)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclose_event)
 */
inline val <C : ServiceWorkerGlobalScope> C.notificationCloseEvent: EventInstance<NotificationEvent, C, C>
    get() = EventInstance(this, NotificationEvent.NOTIFICATION_CLOSE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/push_event)
 */
inline val <C : ServiceWorkerGlobalScope> C.pushEvent: EventInstance<PushEvent, C, C>
    get() = EventInstance(this, PushEvent.PUSH)
