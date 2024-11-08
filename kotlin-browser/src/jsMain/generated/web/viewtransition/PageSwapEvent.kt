// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.viewtransition

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventType
import web.navigation.NavigationActivation

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent)
 */
open external class PageSwapEvent(
    override val type: EventType<PageSwapEvent>,
    init: PageSwapEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/activation)
     */
    val activation: NavigationActivation?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/viewTransition)
     */
    val viewTransition: ViewTransition?

    @JsAlias(THIS)
    override fun asInit(): PageSwapEventInit
}
