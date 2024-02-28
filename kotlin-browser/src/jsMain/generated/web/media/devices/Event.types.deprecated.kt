// Automatically generated - do not modify!

package web.media.devices

import web.events.Event
import web.events.EventType

@Deprecated(
    message = "Legacy type declaration. Use type function instead!",
    replaceWith = ReplaceWith("Event.deviceChange()"),
)
inline val Event.Companion.DEVICE_CHANGE: EventType<Event<*>>
    get() = EventType("devicechange")
