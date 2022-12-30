// Automatically generated - do not modify!

package react.dom.events

import dom.Element
import web.data.DataTransfer

external interface DragEvent<out T : Element> : MouseEvent<T, NativeDragEvent> {
    val dataTransfer: DataTransfer
}
