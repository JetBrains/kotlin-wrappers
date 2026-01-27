package react.raw

import js.array.ReadonlyArray
import react.ViewTransitionInstance
import react.ViewTransitionType
import react.canary.ReactCanary

@ReactCanary
typealias ViewTransitionHandlerRaw = (
    instance: ViewTransitionInstance,
    types: ReadonlyArray<ViewTransitionType>,
) -> Unit
