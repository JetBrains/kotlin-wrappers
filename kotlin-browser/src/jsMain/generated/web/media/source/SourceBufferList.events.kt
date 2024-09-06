// Automatically generated - do not modify!

package web.media.source

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/addsourcebuffer_event)
 */
inline val <C : SourceBufferList> C.addSourceBufferEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.ADD_SOURCE_BUFFER)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/removesourcebuffer_event)
 */
inline val <C : SourceBufferList> C.removeSourceBufferEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.REMOVE_SOURCE_BUFFER)
