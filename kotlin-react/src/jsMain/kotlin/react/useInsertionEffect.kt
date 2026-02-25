package react

import react.internal.createCleanupCallback
import react.raw.useInsertionEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffect(
    effect: suspend CleanupScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useInsertionEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffect(
    vararg dependencies: Any?,
    effect: suspend CleanupScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useInsertionEffectRaw(callback, dependencies)
}
