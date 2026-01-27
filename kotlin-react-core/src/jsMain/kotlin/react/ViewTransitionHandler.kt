package react

import js.array.ReadonlyArray
import react.canary.ReactCanary

@ReactCanary
typealias ViewTransitionHandler = (
    instance: ViewTransitionInstance,
    types: ReadonlyArray<ViewTransitionType>,
) -> Unit
