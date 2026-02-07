package web.http

import kotlinx.js.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
external interface DeferredRequestInit :
    RequestInit {
    var activateAfter: DOMHighResTimeStamp?
}
