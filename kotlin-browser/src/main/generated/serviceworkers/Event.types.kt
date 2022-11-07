// Automatically generated - do not modify!

package serviceworkers

import web.events.Event
import web.events.EventType

inline val Event.Companion.CONTROLLER_CHANGE: EventType<Event>
    get() = EventType("controllerchange")

inline val Event.Companion.STATE_CHANGE: EventType<Event>
    get() = EventType("statechange")

inline val Event.Companion.UPDATE_FOUND: EventType<Event>
    get() = EventType("updatefound")
