// Automatically generated - do not modify!

package web.viewtransition

import js.objects.JsPlainObject
import web.events.EventInit
import web.navigation.NavigationActivation

@JsPlainObject
external interface PageSwapEventInit :
    EventInit {
    val activation: NavigationActivation?
    val viewTransition: ViewTransition?
}
