// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsValue
import web.data.DataTransfer
import web.events.EventType

external interface DragEventInit : MouseEventInit {
    var dataTransfer: DataTransfer?
}

/**
 * A DOM event that represents a drag and drop interaction. The user initiates a drag by placing a pointer device (such as a mouse) on the touch surface and then dragging the pointer to a new location (such as another DOM element). Applications are free to interpret a drag and drop interaction in an application-specific way.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DragEvent)
 */
open external class DragEvent(
    override val type: EventType<DragEvent>,
    init: DragEventInit = definedExternally,
) : MouseEvent {
    /**
     * Returns the DataTransfer object for the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DragEvent/dataTransfer)
     */
    val dataTransfer: DataTransfer?

    companion object {
        @JsValue("drag")
        val DRAG: EventType<DragEvent>

        @JsValue("dragend")
        val DRAG_END: EventType<DragEvent>

        @JsValue("dragenter")
        val DRAG_ENTER: EventType<DragEvent>

        @JsValue("dragleave")
        val DRAG_LEAVE: EventType<DragEvent>

        @JsValue("dragover")
        val DRAG_OVER: EventType<DragEvent>

        @JsValue("dragstart")
        val DRAG_START: EventType<DragEvent>

        @JsValue("drop")
        val DROP: EventType<DragEvent>
    }
}
