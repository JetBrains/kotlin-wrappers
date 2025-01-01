package react

import react.raw.useTransitionRaw

fun useTransition(): TransitionInstance =
    useTransitionRaw()
