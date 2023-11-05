// Automatically generated - do not modify!

package popper.core.modifiers

import js.core.ReadonlyArray
import seskar.js.JsValue

external interface FlipOptions {
    var mainAxis: Boolean
    var altAxis: Boolean
    var fallbackPlacements: ReadonlyArray<popper.core.Placement>
    var padding: popper.core.Padding
    var boundary: dynamic /* Boundary */
    var rootBoundary: dynamic /* RootBoundary */
    var altBoundary: Boolean
    var flipVariations: Boolean
    var allowedAutoPlacements: ReadonlyArray<popper.core.Placement>
}

@JsValue("flip")
external val Flip: popper.core.ModifierName<FlipOptions>
