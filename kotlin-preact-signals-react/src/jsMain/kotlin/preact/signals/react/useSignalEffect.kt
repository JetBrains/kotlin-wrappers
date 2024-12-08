package preact.signals.react

import react.CleanupBuilder
import react.internal.buildCleanupCallback

fun useSignalEffect(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    rawUseSignalEffect(callback)
}
