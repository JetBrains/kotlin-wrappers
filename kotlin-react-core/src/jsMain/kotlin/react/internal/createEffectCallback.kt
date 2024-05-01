package react.internal

import js.array.ReadonlyArray
import react.Cleanup
import react.EffectBuilder

internal fun createEffectCallback(
    effect: EffectBuilder.() -> Unit,
): () -> Cleanup? = {
    val cleanups = arrayOf<Cleanup>()
    effect(cleanups.unsafeCast<EffectBuilder>())
    buildCleanup(cleanups)
}

private fun buildCleanup(
    cleanups: ReadonlyArray<Cleanup>,
): Cleanup? {
    if (cleanups.isEmpty())
        return undefined

    return {
        for (cleanup in cleanups)
            cleanup()
    }
}
