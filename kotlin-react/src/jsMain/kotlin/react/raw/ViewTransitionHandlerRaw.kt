package react.raw

import js.array.ReadonlyArray
import react.Cleanup
import react.ViewTransitionInstance
import react.ViewTransitionType
import react.canary.ReactCanary

@ReactCanary
internal /* raw */
typealias ViewTransitionHandlerRaw = (
    instance: ViewTransitionInstance,
    types: ReadonlyArray<ViewTransitionType>,
) -> Cleanup?
