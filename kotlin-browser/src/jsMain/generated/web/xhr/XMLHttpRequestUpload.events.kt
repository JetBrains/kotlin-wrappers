// Automatically generated - do not modify!

package web.xhr

import web.events.EventInstance
import web.events.ProgressEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/abort_event)
 */
inline val <C : XMLHttpRequestUpload> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.ABORT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/error_event)
 */
inline val <C : XMLHttpRequestUpload> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/load_event)
 */
inline val <C : XMLHttpRequestUpload> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/loadend_event)
 */
inline val <C : XMLHttpRequestUpload> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/loadstart_event)
 */
inline val <C : XMLHttpRequestUpload> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/progress_event)
 */
inline val <C : XMLHttpRequestUpload> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.PROGRESS)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/timeout_event)
 */
inline val <C : XMLHttpRequestUpload> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.TIMEOUT)
