// Automatically generated - do not modify!

package web.audio

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioScheduledSourceNode/ended_event)
 */
inline val <C : AudioScheduledSourceNode> C.endedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ENDED)
