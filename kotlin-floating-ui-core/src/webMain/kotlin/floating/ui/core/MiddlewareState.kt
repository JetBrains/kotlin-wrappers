package floating.ui.core

import floating.ui.utils.Coords
import floating.ui.utils.ElementRects
import floating.ui.utils.Placement
import floating.ui.utils.Strategy
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MiddlewareState :
    Coords {
    val initialPlacement: Placement
    val placement: Placement
    val strategy: Strategy
    val middlewareData: MiddlewareData

    // val elements: Elements
    val rects: ElementRects
    val platform: Platform

    @JsPlainObject
    interface Platform :
        floating.ui.core.Platform {
        // val detectOverflow: typeof detectOverflow
    }
}
