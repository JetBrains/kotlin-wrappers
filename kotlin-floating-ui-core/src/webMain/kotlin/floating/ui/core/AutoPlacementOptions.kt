package floating.ui.core

import floating.ui.utils.Alignment
import floating.ui.utils.Placement
import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AutoPlacementOptions :
    DetectOverflowOptions {
    /**
     * The axis that runs along the alignment of the floating element. Determines
     * whether to check for most space along this axis.
     * @default false
     */
    val crossAxis: Boolean?

    /**
     * Choose placements with a particular alignment.
     * @default undefined
     */
    val alignment: Alignment?

    /**
     * Whether to choose placements with the opposite alignment if the preferred
     * alignment does not fit.
     * @default true
     */
    val autoAlignment: Boolean?

    /**
     * Which placements are allowed to be chosen. Placements must be within the
     * `alignment` option if explicitly set.
     * @default allPlacements (variable)
     */
    val allowedPlacements: ReadonlyArray<Placement>?
}
