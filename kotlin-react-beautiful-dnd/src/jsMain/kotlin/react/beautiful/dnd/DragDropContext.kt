@file:JsModule("react-beautiful-dnd")
@file:JsNonModule

package react.beautiful.dnd

import js.core.ReadonlyArray
import react.Component
import react.PropsWithChildren
import react.ReactNode

// Refer to https://github.com/atlassian/react-beautiful-dnd/blob/master/src/view/drag-drop-context/drag-drop-context.jsx

sealed external interface DragDropContextProps : PropsWithChildren, Responders {
    override var children: ReactNode?
    var dragHandleUsageInstructions: String?
    var nonce: String?
    var enableDefaultSensors: Boolean?
    var sensors: ReadonlyArray<Sensor>?
}

external val DragDropContext: Component<DragDropContextProps, *>
