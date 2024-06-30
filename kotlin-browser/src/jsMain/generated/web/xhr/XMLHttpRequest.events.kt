// Automatically generated - do not modify!

package web.xhr

import web.events.Event
import web.events.EventInstance
import web.events.EventType
import web.events.ProgressEvent

inline val <C : XMLHttpRequest> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("abort"))

inline val <C : XMLHttpRequest> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : XMLHttpRequest> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("load"))

inline val <C : XMLHttpRequest> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("loadend"))

inline val <C : XMLHttpRequest> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("loadstart"))

inline val <C : XMLHttpRequest> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("progress"))

inline val <C : XMLHttpRequest> C.readyStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, EventType("readystatechange"))

inline val <C : XMLHttpRequest> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("timeout"))
