// Automatically generated - do not modify!

package popper.core.modifiers

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import seskar.js.JsValue
import kotlin.js.JsAny

@JsPlainObject
external interface FlipOptions {
    val mainAxis: Boolean
    val altAxis: Boolean
    val fallbackPlacements: ReadonlyArray<popper.core.Placement>
    val padding: popper.core.Padding
    val boundary: JsAny /* Boundary */
    val rootBoundary: JsAny /* RootBoundary */
    val altBoundary: Boolean
    val flipVariations: Boolean
    val allowedAutoPlacements: ReadonlyArray<popper.core.Placement>
}

@JsValue("flip")
external val Flip: popper.core.ModifierName<FlipOptions>
