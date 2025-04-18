// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContentVisibilityAutoStateChangeEvent/skipped)
     */
    val skipped: Boolean

    @JsAlias(THIS)
    override fun asInit(): ContentVisibilityAutoStateChangeEventInit
}
