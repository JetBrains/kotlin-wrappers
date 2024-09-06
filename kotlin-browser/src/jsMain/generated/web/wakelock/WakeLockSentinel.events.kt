// Automatically generated - do not modify!

package web.wakelock

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WakeLockSentinel/release_event)
 */
inline val <C : WakeLockSentinel> C.releaseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.RELEASE)
