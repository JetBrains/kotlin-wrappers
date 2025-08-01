// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`ContentVisibilityAutoStateChangeEvent`** interface is the event object for the element/contentvisibilityautostatechange_event event, which fires on any element with content-visibility set on it when it starts or stops being relevant to the user and skipping its contents.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContentVisibilityAutoStateChangeEvent)
 */
open external class ContentVisibilityAutoStateChangeEvent(
    override val type: EventType<ContentVisibilityAutoStateChangeEvent>,
    init: ContentVisibilityAutoStateChangeEventInit = definedExternally,
) : Event {
    /**
     * The `skipped` read-only property of the ContentVisibilityAutoStateChangeEvent interface returns `true` if the user agent skips the element's contents, or `false` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContentVisibilityAutoStateChangeEvent/skipped)
     */
    val skipped: Boolean
}

inline fun ContentVisibilityAutoStateChangeEvent.asInit(): ContentVisibilityAutoStateChangeEventInit =
    unsafeCast(this)
