// Automatically generated - do not modify!

package web.permissions

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : PermissionStatus> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("change"))
