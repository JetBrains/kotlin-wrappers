// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.cssom

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContentVisibilityAutoStateChangeEvent)
 */
open external class ContentVisibilityAutoStateChangeEvent(
    override val type: EventType<ContentVisibilityAutoStateChangeEvent, EventTarget>,
    init: ContentVisibilityAutoStateChangeEventInit = definedExternally,
) : Event,
    ContentVisibilityAutoStateChangeEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContentVisibilityAutoStateChangeEvent/skipped)
     */
    override val skipped: Boolean

    companion object
}
