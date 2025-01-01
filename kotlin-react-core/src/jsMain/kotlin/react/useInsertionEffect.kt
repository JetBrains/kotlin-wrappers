package react

import kotlinx.coroutines.CoroutineScope
import react.internal.createCleanupCallback
import react.raw.useInsertionEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffect(
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useInsertionEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffect(
    vararg dependencies: Any?,
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useInsertionEffectRaw(callback, dependencies)
}
