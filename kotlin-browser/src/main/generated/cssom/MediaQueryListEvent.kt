// Automatically generated - do not modify!

package cssom

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface MediaQueryListEventInit : EventInit {
    var matches: Boolean?
    var media: String?
}

open external class MediaQueryListEvent(
    type: EventType<MediaQueryListEvent>,
    init: MediaQueryListEventInit = definedExternally,
) : Event {
    val matches: Boolean
    val media: String

    companion object
}
