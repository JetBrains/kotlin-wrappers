package react

import js.core.ReadonlyArray

sealed external interface EffectBuilder {
    @JsName("push")
    fun cleanup(
        block: Cleanup,
    )
}

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
