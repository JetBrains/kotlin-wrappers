// Automatically generated - do not modify!

package web.remoteplayback

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connect_event)
 */
inline val <C : RemotePlayback> C.connectEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.connect())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/connecting_event)
 */
inline val <C : RemotePlayback> C.connectingEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.connecting())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RemotePlayback/disconnect_event)
 */
inline val <C : RemotePlayback> C.disconnectEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.disconnect())
