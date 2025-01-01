package react

import kotlinx.coroutines.CoroutineScope
import react.internal.createCleanupCallback
import react.raw.useEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffect(
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffect(
    vararg dependencies: Any?,
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useEffectRaw(callback, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffectOnce(
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useEffectRaw(callback, emptyArray())
}
