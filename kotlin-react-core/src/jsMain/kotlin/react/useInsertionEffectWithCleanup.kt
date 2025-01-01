package react

import react.internal.buildCleanupCallback
import react.raw.useInsertionEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffectWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useInsertionEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffectWithCleanup(
    vararg dependencies: Any?,
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useInsertionEffectRaw(callback, dependencies)
}
