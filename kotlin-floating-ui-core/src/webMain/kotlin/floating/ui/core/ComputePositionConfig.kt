package floating.ui.core

import floating.ui.utils.Placement
import floating.ui.utils.Strategy
import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ComputePositionConfig {
    /**
     * Object to interface with the current platform.
     */
    val platform: Platform

    /**
     * Where to place the floating element relative to the reference element.
     */
    val placement: Placement?

    /**
     * The strategy to use when positioning the floating element.
     */
    val strategy: Strategy?

    /**
     * Array of middleware objects to modify the positioning or provide data for
     * rendering.
     */
    val middleware: ReadonlyArray<Middleware?>
}
