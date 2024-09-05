// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort_event)
 */
inline val <C : SourceBuffer> C.abortEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.abort())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/error_event)
 */
inline val <C : SourceBuffer> C.errorEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/update_event)
 */
inline val <C : SourceBuffer> C.updateEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.update())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updateend_event)
 */
inline val <C : SourceBuffer> C.updateEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.updateEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updatestart_event)
 */
inline val <C : SourceBuffer> C.updateStartEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.updateStart())
