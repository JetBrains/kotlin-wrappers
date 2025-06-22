package react

import js.array.component1
import js.array.component2
import js.array.tupleOf
import react.internal.isolatedVoidPromise
import react.raw.useTransitionRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useTransition)
 */
fun useTransition(): TransitionInstance {
    val (isPendingRaw, startTransitionRaw) = useTransitionRaw()

    val startTransition: TransitionStartFunction = useCallback { block ->
        startTransitionRaw {
            isolatedVoidPromise(block)
        }
    }

    return tupleOf(isPendingRaw, startTransition)
}
