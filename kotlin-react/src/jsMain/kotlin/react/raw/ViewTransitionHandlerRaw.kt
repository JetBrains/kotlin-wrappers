package react.raw

import js.array.ReadonlyArray
import react.Cleanup
import react.ViewTransitionInstance
import react.ViewTransitionType

internal /* raw */
typealias ViewTransitionHandlerRaw = (
    instance: ViewTransitionInstance,
    types: ReadonlyArray<ViewTransitionType>,
) -> Cleanup?
