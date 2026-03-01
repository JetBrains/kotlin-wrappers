package floating.ui.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ShiftOptions :
    DetectOverflowOptions {
    /**
     * The axis that runs along the alignment of the floating element. Determines
     * whether overflow along this axis is checked to perform shifting.
     * @default true
     */
    val mainAxis: Boolean

    /**
     * The axis that runs along the side of the floating element. Determines
     * whether overflow along this axis is checked to perform shifting.
     * @default false
     */
    val crossAxis: Boolean

    /**
     * Accepts a function that limits the shifting done in order to prevent
     * detachment.
     */
    val limiter: Limiter

    @JsPlainObject
    interface Limiter {
        val fn: (state: MiddlewareState) -> Coords
        val options: Any?
    }
}
