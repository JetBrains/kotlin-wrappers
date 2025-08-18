package web.presentation

import js.objects.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PresentationConnectionAvailableEvent/PresentationConnectionAvailableEvent#options)
 */
@JsPlainObject
external interface PresentationConnectionAvailableEventInit :
    EventInit {
    var connection: PresentationConnection
}
