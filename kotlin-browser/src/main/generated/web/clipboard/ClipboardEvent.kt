// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.clipboard

import dom.data.DataTransfer
import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface ClipboardEventInit : EventInit {
    var clipboardData: DataTransfer?
}

open external class ClipboardEvent(
    override val type: EventType<ClipboardEvent>,
    init: ClipboardEventInit = definedExternally,
) : Event {
    val clipboardData: DataTransfer?

    companion object
}
