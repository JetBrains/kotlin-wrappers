// Automatically generated - do not modify!

package web.viewtransition

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

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

    companion object {
        @JsValue("pagereveal")
        val PAGE_REVEAL: EventType<PageRevealEvent>
    }
}
