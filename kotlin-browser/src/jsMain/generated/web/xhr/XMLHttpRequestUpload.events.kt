// Automatically generated - do not modify!

package web.xhr

import web.events.EventInstance
import web.events.EventType
import web.events.ProgressEvent

inline val <C : XMLHttpRequestUpload> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("abort"))

inline val <C : XMLHttpRequestUpload> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("error"))

inline val <C : XMLHttpRequestUpload> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("load"))

inline val <C : XMLHttpRequestUpload> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("loadend"))

inline val <C : XMLHttpRequestUpload> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("loadstart"))

inline val <C : XMLHttpRequestUpload> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("progress"))

inline val <C : XMLHttpRequestUpload> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, EventType("timeout"))
