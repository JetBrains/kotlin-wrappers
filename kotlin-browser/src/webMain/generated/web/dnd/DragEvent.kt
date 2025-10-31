// Automatically generated - do not modify!

package web.dnd

import web.data.DataTransfer
import web.events.EventType
import web.mouse.MouseEvent
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
     * The **`DragEvent.dataTransfer`** read-only property holds the drag operation's data (as a DataTransfer object).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DragEvent/dataTransfer)
     */
    val dataTransfer: DataTransfer?

    companion object
}

inline val DragEvent.Companion.DRAG: EventType<DragEvent>
    get() = EventType("drag")

inline val DragEvent.Companion.DRAG_END: EventType<DragEvent>
    get() = EventType("dragend")

inline val DragEvent.Companion.DRAG_ENTER: EventType<DragEvent>
    get() = EventType("dragenter")

inline val DragEvent.Companion.DRAG_LEAVE: EventType<DragEvent>
    get() = EventType("dragleave")

inline val DragEvent.Companion.DRAG_OVER: EventType<DragEvent>
    get() = EventType("dragover")

inline val DragEvent.Companion.DRAG_START: EventType<DragEvent>
    get() = EventType("dragstart")

inline val DragEvent.Companion.DROP: EventType<DragEvent>
    get() = EventType("drop")
