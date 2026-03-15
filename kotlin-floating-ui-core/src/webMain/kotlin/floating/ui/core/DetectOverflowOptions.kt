package floating.ui.core

import floating.ui.utils.Padding
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface DetectOverflowOptions {
    /**
     * The clipping element(s) or area in which overflow will be checked.
     * @default 'clippingAncestors'
     */
    val boundary: Boundary?

    /**
     * The root clipping area in which overflow will be checked.
     * @default 'viewport'
     */
    val rootBoundary: RootBoundary?

    /**
     * The element in which overflow is being checked relative to a boundary.
     * @default 'floating'
     */
    val elementContext: ElementContext?

    /**
     * Whether to check for overflow using the alternate element's boundary
     * (`clippingAncestors` boundary only).
     * @default false
     */
    val altBoundary: Boolean?

    /**
     * Virtual padding for the resolved overflow detection offsets.
     * @default 0
     */
    val padding: Padding?
}
