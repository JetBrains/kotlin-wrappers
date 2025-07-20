package web.http

import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface DeferredRequestInit :
    RequestInit {
    var activateAfter: DOMHighResTimeStamp?
}
