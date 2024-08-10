// Automatically generated - do not modify!

package web.notifications

import web.events.Event
import web.events.EventInstance

inline val <C : Notification> C.clickEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.click())

inline val <C : Notification> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.close())

inline val <C : Notification> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

inline val <C : Notification> C.showEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.show())
