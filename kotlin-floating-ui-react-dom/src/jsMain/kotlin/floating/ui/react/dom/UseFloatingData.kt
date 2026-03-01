package floating.ui.react.dom

import floating.ui.core.ComputePositionReturn
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UseFloatingData :
    ComputePositionReturn {

    val isPositioned: Boolean
}
