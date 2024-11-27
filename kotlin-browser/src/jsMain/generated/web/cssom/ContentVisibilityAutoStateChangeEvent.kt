// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventType

/**
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
