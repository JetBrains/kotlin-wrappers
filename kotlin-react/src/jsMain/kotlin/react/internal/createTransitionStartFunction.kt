package react.internal

import js.function.unsafeAsync
import react.TransitionStartFunction
import react.raw.TransitionStartFunctionRaw

internal fun createTransitionStartFunction(
    startRaw: TransitionStartFunctionRaw,
): TransitionStartFunction = { block ->
    startRaw(unsafeAsync { -> block(); undefined })
}
