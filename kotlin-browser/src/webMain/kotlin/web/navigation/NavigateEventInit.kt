package web.navigation

import js.core.JsAny
import js.objects.JsPlainObject
import web.abort.AbortSignal
import web.dom.Element
import web.events.EventInit
import web.form.FormData

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/NavigateEvent#options)
 */
@JsPlainObject
external interface NavigateEventInit :
    EventInit {
    var navigationType: NavigationType?
    var destination: NavigationDestination
    var canIntercept: Boolean?
    var userInitiated: Boolean?
    var hashChange: Boolean?
    var signal: AbortSignal
    var formData: FormData??
    var downloadRequest: String??
    var info: JsAny?
    var hasUAVisualTransition: Boolean?
    var sourceElement: Element?
}
