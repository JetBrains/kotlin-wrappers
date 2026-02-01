package preact.signals.react

import react.CleanupScope
import react.internal.createCleanupCallback

fun useSignalEffect(
    effect: suspend CleanupScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    rawUseSignalEffect(callback)
}
