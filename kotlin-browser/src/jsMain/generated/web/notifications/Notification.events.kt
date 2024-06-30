// Automatically generated - do not modify!

package web.notifications

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : Notification> C.clickEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("click"))

inline val <C : Notification> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("close"))

inline val <C : Notification> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : Notification> C.showEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("show"))
