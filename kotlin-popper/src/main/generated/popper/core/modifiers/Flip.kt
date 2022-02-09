// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package popper.core.modifiers

external interface FlipOptions {
    var mainAxis: Boolean
    var altAxis: Boolean
    var fallbackPlacements: kotlinx.js.ReadonlyArray<popper.core.Placement>
    var padding: popper.core.Padding
    var boundary: dynamic /* Boundary */
    var rootBoundary: dynamic /* RootBoundary */
    var altBoundary: Boolean
    var flipVariations: Boolean
    var allowedAutoPlacements: kotlinx.js.ReadonlyArray<popper.core.Placement>
}

@JsName("'flip'")
external val Flip: popper.core.ModifierName<FlipOptions>
