@file:Suppress("NOTHING_TO_INLINE")

package react

// TODO: make external in IR
class EffectBuilder
private constructor() {
    inline fun cleanup(
        noinline block: RCleanup,
    ) {
        asDynamic().push(block)
    }
}

internal fun createEffectCallback(
    effect: EffectBuilder.() -> Unit,
): () -> RCleanup? = {
    val cleanups = arrayOf<RCleanup>()
    effect(cleanups.unsafeCast<EffectBuilder>())
    buildCleanup(cleanups)
}

private fun buildCleanup(
    cleanups: Array<out RCleanup>,
): RCleanup? {
    if (cleanups.isEmpty())
        return undefined

    return {
        for (cleanup in cleanups)
            cleanup()
    }
}
