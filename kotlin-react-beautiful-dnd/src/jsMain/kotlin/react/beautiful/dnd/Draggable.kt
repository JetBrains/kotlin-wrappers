@file:JsModule("react-beautiful-dnd")

package react.beautiful.dnd

import react.ComponentType
import react.Props

sealed external interface DraggableProps : Props {
    var draggableId: DraggableId
    var index: Int
    var children: DraggableChildrenFn
    var isDragDisabled: Boolean?
    var disableInteractiveElementBlocking: Boolean?
    var shouldRespectForcePress: Boolean?
}

external val Draggable: ComponentType<DraggableProps>
