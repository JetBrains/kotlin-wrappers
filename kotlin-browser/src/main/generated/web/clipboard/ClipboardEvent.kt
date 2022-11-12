// Automatically generated - do not modify!

package web.clipboard

import dom.data.DataTransfer
import web.events.Event
import web.events.EventInit

external interface ClipboardEventInit : EventInit {
    var clipboardData: DataTransfer?
}

open external class ClipboardEvent(
    type: String,
    init: ClipboardEventInit = definedExternally,
) : Event {
    val clipboardData: DataTransfer?

    companion object
}
