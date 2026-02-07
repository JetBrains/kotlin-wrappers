// Automatically generated - do not modify!

package web.navigation

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.dom.Element
import web.events.EventInit
import web.form.FormData
import kotlin.js.JsAny

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent#options)
 */
@JsPlainObject
external interface NavigateEventInit :
    EventInit {
    var canIntercept: Boolean?
    var destination: NavigationDestination
    var downloadRequest: String?
    var formData: FormData?
    var hasUAVisualTransition: Boolean?
    var hashChange: Boolean?
    var info: JsAny?
    var navigationType: NavigationType?
    var signal: AbortSignal
    var sourceElement: Element?
    var userInitiated: Boolean?
}
