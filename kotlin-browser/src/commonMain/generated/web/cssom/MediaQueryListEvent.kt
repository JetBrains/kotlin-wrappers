// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The `MediaQueryListEvent` object stores information on the changes that have happened to a MediaQueryList object — instances are available as the event object on a function referenced by a MediaQueryList.change_event event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent)
 */
open external class MediaQueryListEvent(
    override val type: EventType<MediaQueryListEvent>,
    init: MediaQueryListEventInit = definedExternally,
) : Event {
    /**
     * The **`matches`** read-only property of the `true` if the document currently matches the media query list, or `false` if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/matches)
     */
    val matches: Boolean

    /**
     * The **`media`** read-only property of the a serialized media query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/media)
     */
    val media: MediaQuery

    @JsAlias(THIS)
    override fun asInit(): MediaQueryListEventInit

    companion object {
        @JsValue("change")
        val CHANGE: EventType<MediaQueryListEvent>
    }
}
