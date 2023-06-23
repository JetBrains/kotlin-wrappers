// Automatically generated - do not modify!

package web.xhr

import web.events.EventHandler
import web.events.EventTarget
import web.events.ProgressEvent

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestEventTarget) */
sealed external class XMLHttpRequestEventTarget :
    EventTarget {
    var onabort: EventHandler<ProgressEvent<*>>?
    var onerror: EventHandler<ProgressEvent<*>>?
    var onload: EventHandler<ProgressEvent<*>>?
    var onloadend: EventHandler<ProgressEvent<*>>?
    var onloadstart: EventHandler<ProgressEvent<*>>?
    var onprogress: EventHandler<ProgressEvent<*>>?
    var ontimeout: EventHandler<ProgressEvent<*>>?
}
