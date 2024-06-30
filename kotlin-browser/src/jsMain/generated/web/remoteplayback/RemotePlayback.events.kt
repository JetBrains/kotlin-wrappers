// Automatically generated - do not modify!

package web.remoteplayback

import web.events.Event
import web.events.EventInstance

inline val <C : RemotePlayback> C.connectEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.connect())

inline val <C : RemotePlayback> C.connectingEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.connecting())

inline val <C : RemotePlayback> C.disconnectEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.disconnect())
