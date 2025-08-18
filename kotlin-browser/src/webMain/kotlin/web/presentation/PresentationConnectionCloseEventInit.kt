package web.presentation

import js.objects.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionCloseEvent/PresentationConnectionCloseEvent#options)
 */
@JsPlainObject
@ExperimentalWebApi
external interface PresentationConnectionCloseEventInit :
    EventInit {
    var reason: PresentationConnectionCloseReason
    var message: String?
}
