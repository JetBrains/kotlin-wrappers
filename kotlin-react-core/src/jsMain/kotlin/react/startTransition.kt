package react

import react.internal.isolatedVoidPromise
import react.raw.startTransitionRaw

fun startTransition(
    block: TransitionFunction,
) {
    startTransitionRaw {
        isolatedVoidPromise(block)
    }
}
