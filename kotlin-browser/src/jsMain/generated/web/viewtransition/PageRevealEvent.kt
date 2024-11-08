// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.viewtransition

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageRevealEvent)
 */
open external class PageRevealEvent(
    override val type: EventType<PageRevealEvent>,
    init: PageRevealEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageRevealEvent/viewTransition)
     */
    val viewTransition: ViewTransition?

    @JsAlias(THIS)
    override fun asInit(): PageRevealEventInit
}
