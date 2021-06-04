@file:Suppress("NOTHING_TO_INLINE")

package react

// TODO: make external in IR
class REffectBuilder
private constructor() {
    inline fun cleanup(
        noinline block: RCleanup,
    ) {
        asDynamic().push(block)
    }
}

internal fun useEffectCallback(
    effect: REffectBuilder.() -> Unit,
): () -> RCleanup? =
    useCallback(effect) {
        val cleanups = arrayOf<RCleanup>()
        effect(cleanups.unsafeCast<REffectBuilder>())
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
