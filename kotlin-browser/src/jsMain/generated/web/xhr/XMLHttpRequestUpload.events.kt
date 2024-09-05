// Automatically generated - do not modify!

package web.xhr

import web.events.EventInstance
import web.events.ProgressEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/abort_event)
 */
inline val <C : XMLHttpRequestUpload> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.abort())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/error_event)
 */
inline val <C : XMLHttpRequestUpload> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/load_event)
 */
inline val <C : XMLHttpRequestUpload> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.load())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/loadend_event)
 */
inline val <C : XMLHttpRequestUpload> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/loadstart_event)
 */
inline val <C : XMLHttpRequestUpload> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/progress_event)
 */
inline val <C : XMLHttpRequestUpload> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.progress())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/timeout_event)
 */
inline val <C : XMLHttpRequestUpload> C.timeoutEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.timeout())
