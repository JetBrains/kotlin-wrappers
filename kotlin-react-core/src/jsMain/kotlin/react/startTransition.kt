package react

import react.raw.startTransitionRaw

fun startTransition(
    scope: TransitionFunction,
) {
    startTransitionRaw(scope)
}
