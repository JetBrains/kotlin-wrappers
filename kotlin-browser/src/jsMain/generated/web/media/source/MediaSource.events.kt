// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceclose_event)
 */
inline val <C : MediaSource> C.sourceCloseEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.sourceClose())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceended_event)
 */
inline val <C : MediaSource> C.sourceEndedEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.sourceEnded())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceopen_event)
 */
inline val <C : MediaSource> C.sourceOpenEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.sourceOpen())
