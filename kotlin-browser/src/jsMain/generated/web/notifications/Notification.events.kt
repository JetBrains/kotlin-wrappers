// Automatically generated - do not modify!

package web.notifications

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/click_event)
 */
inline val <C : Notification> C.clickEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.CLICK)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close_event)
 */
inline val <C : Notification> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.CLOSE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/error_event)
 */
inline val <C : Notification> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/show_event)
 */
inline val <C : Notification> C.showEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.SHOW)
