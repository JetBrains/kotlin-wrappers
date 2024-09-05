// Automatically generated - do not modify!

package web.xhr

import web.events.Event
import web.events.EventInstance
import web.events.ProgressEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/abort_event)
 */
inline val <C : XMLHttpRequest> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.abort())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/error_event)
 */
inline val <C : XMLHttpRequest> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/load_event)
 */
inline val <C : XMLHttpRequest> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.load())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/loadend_event)
 */
inline val <C : XMLHttpRequest> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/loadstart_event)
 */
inline val <C : XMLHttpRequest> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/progress_event)
 */
inline val <C : XMLHttpRequest> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.progress())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readystatechange_event)
 */
inline val <C : XMLHttpRequest> C.readyStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.readyStateChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/timeout_event)
 */
inline val <C : XMLHttpRequest> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.timeout())
