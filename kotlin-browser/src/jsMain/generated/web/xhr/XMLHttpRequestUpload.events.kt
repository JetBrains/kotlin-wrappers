// Automatically generated - do not modify!

package web.xhr

import web.events.EventInstance
import web.events.ProgressEvent

inline val <C : XMLHttpRequestUpload> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.abort())

inline val <C : XMLHttpRequestUpload> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.error())

inline val <C : XMLHttpRequestUpload> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.load())

inline val <C : XMLHttpRequestUpload> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadEnd())

inline val <C : XMLHttpRequestUpload> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadStart())

inline val <C : XMLHttpRequestUpload> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.progress())

inline val <C : XMLHttpRequestUpload> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.timeout())
