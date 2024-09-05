// Automatically generated - do not modify!

package web.vtt

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cuechange_event)
 */
inline val <C : TextTrack> C.cueChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.cueChange())
