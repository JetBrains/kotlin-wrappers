package web.presentation

import kotlinx.js.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionAvailableEvent/PresentationConnectionAvailableEvent#options)
 */
@JsPlainObject
@ExperimentalWebApi
external interface PresentationConnectionAvailableEventInit :
    EventInit {
    var connection: PresentationConnection
}
