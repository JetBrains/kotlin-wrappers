// Automatically generated - do not modify!

package web.file

import web.events.EventInstance
import web.events.EventType
import web.events.ProgressEvent

inline val <C : FileReader> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("abort"))

inline val <C : FileReader> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : FileReader> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("load"))

inline val <C : FileReader> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("loadend"))

inline val <C : FileReader> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("loadstart"))

inline val <C : FileReader> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("progress"))
