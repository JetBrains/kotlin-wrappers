// Automatically generated - do not modify!

package web.file

import web.events.EventInstance
import web.events.ProgressEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort_event)
 */
inline val <C : FileReader> C.abortEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.abort())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error_event)
 */
inline val <C : FileReader> C.errorEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.error())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/load_event)
 */
inline val <C : FileReader> C.loadEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.load())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadend_event)
 */
inline val <C : FileReader> C.loadEndEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadEnd())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadstart_event)
 */
inline val <C : FileReader> C.loadStartEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.loadStart())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/progress_event)
 */
inline val <C : FileReader> C.progressEvent: EventInstance<ProgressEvent, C, C>
    get() = EventInstance(this, ProgressEvent.progress())
