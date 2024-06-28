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
    var onabort: EventHandler<ProgressEvent, XMLHttpRequest, EventTarget>?
    var onerror: EventHandler<ProgressEvent, XMLHttpRequest, EventTarget>?
    var onload: EventHandler<ProgressEvent, XMLHttpRequest, EventTarget>?
    var onloadend: EventHandler<ProgressEvent, XMLHttpRequest, EventTarget>?
    var onloadstart: EventHandler<ProgressEvent, XMLHttpRequest, EventTarget>?
    var onprogress: EventHandler<ProgressEvent, XMLHttpRequest, EventTarget>?
    var ontimeout: EventHandler<ProgressEvent, XMLHttpRequest, EventTarget>?
}
