// Automatically generated - do not modify!

package dom.events

import dom.data.DataTransfer
import web.events.EventType

external interface DragEventInit : MouseEventInit {
    var dataTransfer: DataTransfer?
}

open external class DragEvent(
    type: EventType<DragEvent>,
    init: DragEventInit = definedExternally,
) : MouseEvent {
    /** Returns the DataTransfer object for the event. */
    val dataTransfer: DataTransfer?

    companion object
}
