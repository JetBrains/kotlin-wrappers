// Automatically generated - do not modify!

package web.file

import web.events.EventInstance
import web.events.ProgressEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort_event)
 */
inline val <C : FileReader> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.ABORT)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error_event)
 */
inline val <C : FileReader> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.ERROR)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/load_event)
 */
inline val <C : FileReader> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadend_event)
 */
inline val <C : FileReader> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD_END)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadstart_event)
 */
inline val <C : FileReader> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.LOAD_START)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/progress_event)
 */
inline val <C : FileReader> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.PROGRESS)
