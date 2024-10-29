// Automatically generated - do not modify!

package web.xhr

import web.events.EventInstance
import web.events.JsEvent
import web.events.ProgressEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload)
 */
sealed external class XMLHttpRequestUpload :
    XMLHttpRequestEventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/abort_event)
     */
    @JsEvent("abort")
    val abortEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload /* this */, XMLHttpRequestUpload /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/error_event)
     */
    @JsEvent("error")
    val errorEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload /* this */, XMLHttpRequestUpload /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/load_event)
     */
    @JsEvent("load")
    val loadEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload /* this */, XMLHttpRequestUpload /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/loadend_event)
     */
    @JsEvent("loadend")
    val loadEndEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload /* this */, XMLHttpRequestUpload /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/loadstart_event)
     */
    @JsEvent("loadstart")
    val loadStartEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload /* this */, XMLHttpRequestUpload /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/progress_event)
     */
    @JsEvent("progress")
    val progressEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload /* this */, XMLHttpRequestUpload /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload/timeout_event)
     */
    @JsEvent("timeout")
    val timeoutEvent: EventInstance<ProgressEvent, XMLHttpRequestUpload /* this */, XMLHttpRequestUpload /* this */>
}
