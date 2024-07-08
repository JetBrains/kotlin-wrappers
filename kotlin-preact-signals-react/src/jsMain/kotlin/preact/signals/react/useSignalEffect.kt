package preact.signals.react

import react.CleanupBuilder
import react.internal.createCleanupCallback

fun useSignalEffect(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    rawUseSignalEffect(callback)
}
