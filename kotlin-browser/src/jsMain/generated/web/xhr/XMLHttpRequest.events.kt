// Automatically generated - do not modify!

package web.xhr

import web.events.Event
import web.events.EventInstance
import web.events.ProgressEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/abort_event)
 */
inline val <C : XMLHttpRequest> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.ABORT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/error_event)
 */
inline val <C : XMLHttpRequest> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/load_event)
 */
inline val <C : XMLHttpRequest> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/loadend_event)
 */
inline val <C : XMLHttpRequest> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/loadstart_event)
 */
inline val <C : XMLHttpRequest> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/progress_event)
 */
inline val <C : XMLHttpRequest> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.PROGRESS)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readystatechange_event)
 */
inline val <C : XMLHttpRequest> C.readyStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.READY_STATE_CHANGE)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/timeout_event)
 */
inline val <C : XMLHttpRequest> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.TIMEOUT)
