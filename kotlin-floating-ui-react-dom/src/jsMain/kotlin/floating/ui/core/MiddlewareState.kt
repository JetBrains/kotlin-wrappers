package floating.ui.core

import floating.ui.utils.Coords
import floating.ui.utils.Placement
import floating.ui.utils.Strategy
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MiddlewareState :
    Coords {
    val initialPlacement: Placement
    val placement: Placement
    val strategy: Strategy
    // TBD
}
