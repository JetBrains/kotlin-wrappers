package preact.signals.react

import react.EffectBuilder
import react.internal.createEffectCallback

fun useSignalEffect(
    effect: EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseSignalEffect(callback)
}
