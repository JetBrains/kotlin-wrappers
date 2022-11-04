// Automatically generated - do not modify!

package dom.events

external interface DragEventInit : MouseEventInit {
    var dataTransfer: DataTransfer?
}

open external class DragEvent(
    type: String,
    init: DragEventInit = definedExternally,
) : MouseEvent {
    /** Returns the DataTransfer object for the event. */
    val dataTransfer: DataTransfer?

    companion object
}
