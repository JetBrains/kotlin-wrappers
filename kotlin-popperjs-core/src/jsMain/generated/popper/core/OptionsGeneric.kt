// Automatically generated - do not modify!

package popper.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface OptionsGeneric<TModifier> {
    val placement: Placement
    val modifiers: ReadonlyArray<TModifier>
    val strategy: PositioningStrategy
    val onFirstUpdate: UpdateCallback?
}
