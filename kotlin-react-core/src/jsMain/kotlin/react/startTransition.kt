package react

import react.internal.isolatedVoidPromise
import react.raw.startTransitionRaw

/**
 * [Online Documentation](https://react.dev/reference/react/startTransition)
 */
fun startTransition(
    block: TransitionFunction,
) {
    startTransitionRaw {
        isolatedVoidPromise(block)
    }
}
