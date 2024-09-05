// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedamountlow_event)
 */
inline val <C : RTCDataChannel> C.bufferedAmountLowEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.bufferedAmountLow())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close_event)
 */
inline val <C : RTCDataChannel> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.close())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/closing_event)
 */
inline val <C : RTCDataChannel> C.closingEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.closing())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/error_event)
 */
inline val <C : RTCDataChannel> C.errorEvent: EventInstance<RTCErrorEvent, C, C>
    get() = EventInstance(this, RTCErrorEvent.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/message_event)
 */
inline val <C : RTCDataChannel> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.message())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/open_event)
 */
inline val <C : RTCDataChannel> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.open())
