// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.data.DataTransfer
import web.events.EventType

external interface DragEventInit : MouseEventInit {
    var dataTransfer: DataTransfer?
}

open external class DragEvent(
    override val type: EventType<DragEvent>,
    init: DragEventInit = definedExternally,
) : MouseEvent {
    /** Returns the DataTransfer object for the event. */
    val dataTransfer: DataTransfer?

    companion object
}
