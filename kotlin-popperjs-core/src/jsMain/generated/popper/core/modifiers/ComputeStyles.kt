// Automatically generated - do not modify!

package popper.core.modifiers

import js.objects.JsPlainObject
import seskar.js.JsValue

@JsPlainObject
external interface ComputeStylesOptions {
    val gpuAcceleration: Boolean
    val adaptive: Boolean
    val roundOffsets: Boolean /* boolean | RoundOffsets */?
}

@JsValue("computeStyles")
external val ComputeStyles: popper.core.ModifierName<ComputeStylesOptions>
