// Automatically generated - do not modify!

package web.permissions

import web.events.Event
import web.events.EventInstance

inline val <C : PermissionStatus> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.change())
