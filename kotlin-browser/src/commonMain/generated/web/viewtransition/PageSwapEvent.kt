// Automatically generated - do not modify!

package web.viewtransition

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import web.navigation.NavigationActivation
import kotlin.js.definedExternally

/**
 * The **`PageSwapEvent`** event object is made available inside handler functions for the Window.pageswap_event event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent)
 */
open external class PageSwapEvent(
    override val type: EventType<PageSwapEvent>,
    init: PageSwapEventInit = definedExternally,
) : Event {
    /**
     * The **`activation`** read-only property of the PageSwapEvent interface contains a NavigationActivation object containing the navigation type and current and destination document history entries for a same-origin navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/activation)
     */
    val activation: NavigationActivation?

    /**
     * The **`viewTransition`** read-only property of the PageRevealEvent interface contains a ViewTransition object representing the active view transition for the cross-document navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/viewTransition)
     */
    val viewTransition: ViewTransition?

    companion object {
        @JsValue("pageswap")
        val PAGE_SWAP: EventType<PageSwapEvent>
    }
}

inline fun PageSwapEvent.asInit(): PageSwapEventInit =
    unsafeCast(this)
