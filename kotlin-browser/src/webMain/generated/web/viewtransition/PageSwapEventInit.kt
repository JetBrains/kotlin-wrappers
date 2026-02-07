// Automatically generated - do not modify!

package web.viewtransition

import kotlinx.js.JsPlainObject
import web.events.EventInit
import web.navigation.NavigationActivation

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/PageSwapEvent#options)
 */
@JsPlainObject
external interface PageSwapEventInit :
    EventInit {
    var activation: NavigationActivation?
    var viewTransition: ViewTransition?
}
