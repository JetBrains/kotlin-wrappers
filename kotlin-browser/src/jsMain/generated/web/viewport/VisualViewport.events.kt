// Automatically generated - do not modify!

package web.viewport

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/resize_event)
 */
inline val <C : VisualViewport> C.resizeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.resize())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scroll_event)
 */
inline val <C : VisualViewport> C.scrollEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.scroll())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scrollend_event)
 */
inline val <C : VisualViewport> C.scrollEndEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.scrollEnd())
