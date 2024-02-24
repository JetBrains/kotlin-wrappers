// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.history

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * The PageTransitionEvent is fired when a document is being loaded or unloaded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent)
 */
open external class PageTransitionEvent<out C : EventTarget?>(
    override val type: EventType<PageTransitionEvent<*>>,
    init: PageTransitionEventInit = definedExternally,
) : Event<C>,
    PageTransitionEventInit {
    /**
     * For the pageshow event, returns false if the page is newly being loaded (and the load event will fire). Otherwise, returns true.
     *
     * For the pagehide event, returns false if the page is going away for the last time. Otherwise, returns true, meaning that (if nothing conspires to make the page unsalvageable) the page might be reused if the user navigates back to this page.
     *
     * Things that can cause the page to be unsalvageable include:
     *
     * The user agent decided to not keep the Document alive in a session history entry after unload
     * Having iframes that are not salvageable
     * Active WebSocket objects
     * Aborting a Document
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent/persisted)
     */
    override val persisted: Boolean

    companion object : PageTransitionEventTypes
}
