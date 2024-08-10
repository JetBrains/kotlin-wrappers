// Automatically generated - do not modify!

package web.xhr

import web.events.Event
import web.events.EventInstance
import web.events.ProgressEvent

inline val <C : XMLHttpRequest> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.abort())

inline val <C : XMLHttpRequest> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.error())

inline val <C : XMLHttpRequest> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.load())

inline val <C : XMLHttpRequest> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadEnd())

inline val <C : XMLHttpRequest> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadStart())

inline val <C : XMLHttpRequest> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.progress())

inline val <C : XMLHttpRequest> C.readyStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.readyStateChange())

inline val <C : XMLHttpRequest> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.timeout())
