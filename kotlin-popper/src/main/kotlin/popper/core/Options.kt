package popper.core

import kotlinext.js.ReadonlyArray

external interface Options {
    var placement: Placement
    var modifiers: ReadonlyArray<Modifier<*>> // $Shape
    var strategy: PositioningStrategy
    var onFirstUpdate: (State) -> Unit // $Shape
}
