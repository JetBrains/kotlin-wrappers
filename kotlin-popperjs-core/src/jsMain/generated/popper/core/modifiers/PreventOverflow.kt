// Automatically generated - do not modify!

package popper.core.modifiers

import seskar.js.JsValue

sealed external interface TetherOffsetType

external interface PreventOverflowOptions {
    var mainAxis: Boolean
    var altAxis: Boolean
    var boundary: dynamic /* Boundary */
    var rootBoundary: dynamic /* RootBoundary */
    var altBoundary: Boolean

    /**
     * Allows the popper to overflow from its boundaries to keep it near its
     * reference element
     */
    var tether: Boolean
    var tetherOffset: TetherOffsetType
    var padding: popper.core.Padding
}

@JsValue("preventOverflow")
external val PreventOverflow: popper.core.ModifierName<PreventOverflowOptions>
