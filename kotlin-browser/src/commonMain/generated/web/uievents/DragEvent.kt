// Automatically generated - do not modify!

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.data.DataTransfer
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`DragEvent`** interface is a DOM event that represents a drag and drop interaction.
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

    @JsAlias(THIS)
    override fun asInit(): DragEventInit

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
