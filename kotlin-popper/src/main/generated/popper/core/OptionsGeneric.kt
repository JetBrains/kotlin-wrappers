// Automatically generated - do not modify!

package popper.core

external interface OptionsGeneric<TModifier> {
    var placement: Placement
    var modifiers: Array<TModifier>
    var strategy: PositioningStrategy
    var onFirstUpdate: ((State) -> Unit)?
}
