package popper

import kotlinext.js.ReadonlyArray

external interface PopperOptions<Modifiers> {
    var placement: Placement
    var modifiers: ReadonlyArray<Modifier<Modifiers>> // $Shape
    var strategy: PositioningStrategy
    var onFirstUpdate: (State) -> Unit // $Shape
}
