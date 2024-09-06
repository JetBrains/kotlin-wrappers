// Automatically generated - do not modify!

package web.media.streams

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/ended_event)
 */
inline val <C : MediaStreamTrack> C.endedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ENDED)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/mute_event)
 */
inline val <C : MediaStreamTrack> C.muteEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.MUTE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/unmute_event)
 */
inline val <C : MediaStreamTrack> C.unmuteEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.UNMUTE)
