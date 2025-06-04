// Automatically generated - do not modify!

package web.history

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`PageTransitionEvent`** event object is available inside handler functions for the `pageshow` and `pagehide` events, fired when a document is being loaded or unloaded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent)
 */
open external class PageTransitionEvent(
    override val type: EventType<PageTransitionEvent>,
    init: PageTransitionEventInit = definedExternally,
) : Event {
    /**
     * The **`persisted`** read-only property indicates if a webpage is loading from a cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent/persisted)
     */
    val persisted: Boolean

    @JsAlias(THIS)
    override fun asInit(): PageTransitionEventInit

    companion object {
        @JsValue("pagehide")
        val PAGE_HIDE: EventType<PageTransitionEvent>

        @JsValue("pageshow")
        val PAGE_SHOW: EventType<PageTransitionEvent>
    }
}
