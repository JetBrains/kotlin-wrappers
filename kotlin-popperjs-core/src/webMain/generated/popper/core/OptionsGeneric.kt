// Automatically generated - do not modify!

package popper.core

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface OptionsGeneric<TModifier : JsAny?> {
    val placement: Placement
    val modifiers: ReadonlyArray<TModifier>
    val strategy: PositioningStrategy
    val onFirstUpdate: UpdateCallback?
}
