// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedamountlow_event)
 */
inline val <C : RTCDataChannel> C.bufferedAmountLowEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.BUFFERED_AMOUNT_LOW)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close_event)
 */
inline val <C : RTCDataChannel> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.CLOSE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/closing_event)
 */
inline val <C : RTCDataChannel> C.closingEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.CLOSING)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/error_event)
 */
inline val <C : RTCDataChannel> C.errorEvent: EventInstance<RTCErrorEvent, C, C>
    get() = EventInstance(this, RTCErrorEvent.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/message_event)
 */
inline val <C : RTCDataChannel> C.messageEvent: EventInstance<MessageEvent<Any?>, C, C>
    get() = EventInstance(this, MessageEvent.MESSAGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/open_event)
 */
inline val <C : RTCDataChannel> C.openEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.OPEN)
