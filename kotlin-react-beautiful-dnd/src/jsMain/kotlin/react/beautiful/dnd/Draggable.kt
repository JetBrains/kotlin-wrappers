@file:JsModule("react-beautiful-dnd")
@file:JsNonModule

package react.beautiful.dnd

import react.ComponentClass
import react.Props

sealed external interface DraggableProps : Props {
    var draggableId: DraggableId
    var index: Int
    var children: DraggableChildrenFn
    var isDragDisabled: Boolean?
    var disableInteractiveElementBlocking: Boolean?
    var shouldRespectForcePress: Boolean?
}

external val Draggable: ComponentClass<DraggableProps>
