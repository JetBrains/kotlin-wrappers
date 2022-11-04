// Automatically generated - do not modify!

package dom.events

import dom.html.Window
import web.events.Event
import web.events.EventInit

external interface UIEventInit : EventInit {
    var detail: Int?
    var view: Window?
}

open external class UIEvent(
    type: String,
    init: UIEventInit = definedExternally,
) : Event {
    val detail: Int
    val view: Window?

    companion object
}
