// Automatically generated - do not modify!

package cssom

import web.events.Event
import web.events.EventInit

external interface MediaQueryListEventInit : EventInit {
    var matches: Boolean?
    var media: String?
}

open external class MediaQueryListEvent(
    type: String,
    init: MediaQueryListEventInit = definedExternally,
) : Event {
    val matches: Boolean
    val media: String

    companion object
}
