// Automatically generated - do not modify!

package web.xhr

import web.events.EventHandler
import web.events.EventTarget
import web.events.ProgressEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestEventTarget)
 */
sealed external class XMLHttpRequestEventTarget :
    EventTarget {
    var onabort: EventHandler<ProgressEvent, XMLHttpRequest, XMLHttpRequest>?
    var onerror: EventHandler<ProgressEvent, XMLHttpRequest, XMLHttpRequest>?
    var onload: EventHandler<ProgressEvent, XMLHttpRequest, XMLHttpRequest>?
    var onloadend: EventHandler<ProgressEvent, XMLHttpRequest, XMLHttpRequest>?
    var onloadstart: EventHandler<ProgressEvent, XMLHttpRequest, XMLHttpRequest>?
    var onprogress: EventHandler<ProgressEvent, XMLHttpRequest, XMLHttpRequest>?
    var ontimeout: EventHandler<ProgressEvent, XMLHttpRequest, XMLHttpRequest>?
}
