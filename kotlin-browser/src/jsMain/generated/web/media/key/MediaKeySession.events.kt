// Automatically generated - do not modify!

package web.media.key

import web.events.Event
import web.events.EventInstance

inline val <C : MediaKeySession> C.keyStatusesChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.keyStatusesChange())

inline val <C : MediaKeySession> C.messageEvent: EventInstance<MediaKeyMessageEvent, C, C>
    get() = EventInstance(this, MediaKeyMessageEvent.message())
