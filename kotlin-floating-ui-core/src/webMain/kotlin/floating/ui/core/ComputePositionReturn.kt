package floating.ui.core

import floating.ui.utils.Coords
import floating.ui.utils.Placement
import floating.ui.utils.Strategy
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ComputePositionReturn :
    Coords {
    /**
     * The final chosen placement of the floating element.
     */
    val placement: Placement

    /**
     * The strategy used to position the floating element.
     */
    val strategy: Strategy

    /**
     * Object containing data returned from all middleware, keyed by their name.
     */
    val middlewareData: MiddlewareData
}
