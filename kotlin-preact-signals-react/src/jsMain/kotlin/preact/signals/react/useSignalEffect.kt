package preact.signals.react

import preact.signals.react.raw.useSignalEffectRaw
import react.CleanupScope
import react.internal.createCleanupCallback

fun useSignalEffect(
    effect: suspend CleanupScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useSignalEffectRaw(callback)
}
