// Automatically generated - do not modify!

package web.wakelock

import web.events.Event
import web.events.EventInstance
import web.events.EventType

inline val <C : WakeLockSentinel> C.releaseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("release"))
