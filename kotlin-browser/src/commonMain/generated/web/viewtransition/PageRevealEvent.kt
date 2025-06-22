// Automatically generated - do not modify!

package web.viewtransition

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`PageRevealEvent`** event object is made available inside handler functions for the Window.pagereveal_event event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageRevealEvent)
 */
open external class PageRevealEvent(
    override val type: EventType<PageRevealEvent>,
    init: PageRevealEventInit = definedExternally,
) : Event {
    /**
     * The **`viewTransition`** read-only property of the PageRevealEvent interface contains a ViewTransition object representing the active view transition for the cross-document navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageRevealEvent/viewTransition)
     */
    val viewTransition: ViewTransition?

    companion object {
        @JsValue("pagereveal")
        val PAGE_REVEAL: EventType<PageRevealEvent>
    }
}

inline fun PageRevealEvent.asInit(): PageRevealEventInit =
    unsafeCast(this)
