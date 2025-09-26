package react

import react.internal.createTransitionStartFunction
import react.raw.startTransitionRaw

/**
 * [Online Documentation](https://react.dev/reference/react/startTransition)
 */
val startTransition: TransitionStartFunction =
    createTransitionStartFunction(startTransitionRaw)
