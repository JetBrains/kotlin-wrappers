// Automatically generated - do not modify!

package react.dom.events

import web.data.DataTransfer
import web.dom.Element

external interface DragEvent<out T : Element> : MouseEvent<T, NativeDragEvent> {
    val dataTransfer: DataTransfer
}
