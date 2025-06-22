// Automatically generated - do not modify!

package web.history

import js.reflect.unsafeCast
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

    companion object
}

inline fun PageTransitionEvent.asInit(): PageTransitionEventInit =
    unsafeCast(this)

inline val PageTransitionEvent.Companion.PAGE_HIDE: EventType<PageTransitionEvent>
    get() = EventType("pagehide")

inline val PageTransitionEvent.Companion.PAGE_SHOW: EventType<PageTransitionEvent>
    get() = EventType("pageshow")
