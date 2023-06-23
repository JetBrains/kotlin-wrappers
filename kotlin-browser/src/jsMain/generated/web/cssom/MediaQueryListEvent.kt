// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.cssom

import web.events.Event
import web.events.EventInit
import web.events.EventType

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent) */
external interface MediaQueryListEventInit : EventInit {
    var matches: Boolean?
    var media: MediaQuery?
}

open external class MediaQueryListEvent(
    override val type: EventType<MediaQueryListEvent>,
    init: MediaQueryListEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/matches) */
    val matches: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/media) */
    val media: MediaQuery

    companion object
}
