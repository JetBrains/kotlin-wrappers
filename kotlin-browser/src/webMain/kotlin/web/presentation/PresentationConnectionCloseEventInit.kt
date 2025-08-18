package web.presentation

import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionCloseEvent/PresentationConnectionCloseEvent#options)
 */
@JsPlainObject
external interface PresentationConnectionCloseEventInit :
    EventInit {
    var reason: PresentationConnectionCloseReason
    var message: String?
}
