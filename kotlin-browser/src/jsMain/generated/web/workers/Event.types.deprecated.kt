// Automatically generated - do not modify!

package web.workers

import web.events.Event
import web.events.EventType

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.languageChange()"),
)
inline val Event.Companion.LANGUAGE_CHANGE: EventType<Event<*>>
    get() = EventType("languagechange")

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.offline()"),
)
inline val Event.Companion.OFFLINE: EventType<Event<*>>
    get() = EventType("offline")

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.online()"),
)
inline val Event.Companion.ONLINE: EventType<Event<*>>
    get() = EventType("online")
