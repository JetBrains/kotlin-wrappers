// Automatically generated - do not modify!

package web.serviceworker

import web.events.Event
import web.events.EventType

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.controllerChange()"),
)
inline val Event.Companion.CONTROLLER_CHANGE: EventType<Event<*>>
    get() = EventType("controllerchange")

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.stateChange()"),
)
inline val Event.Companion.STATE_CHANGE: EventType<Event<*>>
    get() = EventType("statechange")

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.updateFound()"),
)
inline val Event.Companion.UPDATE_FOUND: EventType<Event<*>>
    get() = EventType("updatefound")
