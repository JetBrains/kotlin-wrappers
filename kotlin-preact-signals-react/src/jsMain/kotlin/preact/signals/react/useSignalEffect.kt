package preact.signals.react

import kotlinx.coroutines.CoroutineScope
import preact.signals.react.raw.useSignalEffectRaw
import react.internal.createCleanupCallback

fun useSignalEffect(
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useSignalEffectRaw(callback)
}
