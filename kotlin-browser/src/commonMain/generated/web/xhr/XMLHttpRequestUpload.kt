// Automatically generated - do not modify!

package web.xhr

import web.events.EventInstance
import web.events.ProgressEvent

/**
 * The **`XMLHttpRequestUpload`** interface represents the upload process for a specific XMLHttpRequest.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload)
 */
external class XMLHttpRequestUpload
private constructor() :
    XMLHttpRequestEventTarget

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/abort_event)
 */
inline val XMLHttpRequestUpload.abortEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload, XMLHttpRequestUpload>
    get() = EventInstance(this, "abort")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/error_event)
 */
inline val XMLHttpRequestUpload.errorEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload, XMLHttpRequestUpload>
    get() = EventInstance(this, "error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/load_event)
 */
inline val XMLHttpRequestUpload.loadEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload, XMLHttpRequestUpload>
    get() = EventInstance(this, "load")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/loadend_event)
 */
inline val XMLHttpRequestUpload.loadEndEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload, XMLHttpRequestUpload>
    get() = EventInstance(this, "loadend")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/loadstart_event)
 */
inline val XMLHttpRequestUpload.loadStartEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload, XMLHttpRequestUpload>
    get() = EventInstance(this, "loadstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/progress_event)
 */
inline val XMLHttpRequestUpload.progressEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload, XMLHttpRequestUpload>
    get() = EventInstance(this, "progress")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/timeout_event)
 */
inline val XMLHttpRequestUpload.timeoutEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload, XMLHttpRequestUpload>
    get() = EventInstance(this, "timeout")
