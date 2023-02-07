// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.cssom

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MediaQueryListEventInit : EventInit {
    var matches: Boolean?
    var media: String?
}

open external class MediaQueryListEvent(
    override val type: EventType<MediaQueryListEvent>,
    init: MediaQueryListEventInit = definedExternally,
) : Event {
    val matches: Boolean
    val media: String

    companion object
}
