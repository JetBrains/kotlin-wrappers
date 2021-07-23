@file:Suppress("NOTHING_TO_INLINE")

package react

// TODO: make external in IR
class EffectBuilder
private constructor() {
    inline fun cleanup(
        noinline block: Cleanup,
    ) {
        asDynamic().push(block)
    }
}

internal fun createEffectCallback(
    effect: EffectBuilder.() -> Unit,
): () -> Cleanup? = {
    val cleanups = arrayOf<Cleanup>()
    effect(cleanups.unsafeCast<EffectBuilder>())
    buildCleanup(cleanups)
}

private fun buildCleanup(
    cleanups: Array<out Cleanup>,
): Cleanup? {
    if (cleanups.isEmpty())
        return undefined

    return {
        for (cleanup in cleanups)
            cleanup()
    }
}
