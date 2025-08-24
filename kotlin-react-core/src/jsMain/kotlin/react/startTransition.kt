package react

import js.coroutines.internal.createIsolatedPromise
import react.raw.startTransitionRaw

/**
 * [Online Documentation](https://react.dev/reference/react/startTransition)
 */
fun startTransition(
    block: TransitionFunction,
) {
    startTransitionRaw {
        createIsolatedPromise(block)
            .then { undefined }
    }
}
