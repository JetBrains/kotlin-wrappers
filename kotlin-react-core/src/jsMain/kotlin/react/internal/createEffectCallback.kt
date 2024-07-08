package react.internal

import react.Cleanup
import react.EffectBuilder

internal fun createEffectCallback(
    effect: EffectBuilder.() -> Unit,
): () -> Cleanup? = {
    val cleanups = arrayOf<Cleanup>()
    effect(cleanups.unsafeCast<EffectBuilder>())
    buildCleanup(cleanups)
}
