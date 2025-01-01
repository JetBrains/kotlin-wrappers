package react

import kotlinx.coroutines.CoroutineScope
import react.internal.createCleanupCallback
import react.raw.useLayoutEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffect(
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useLayoutEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffect(
    vararg dependencies: Any?,
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useLayoutEffectRaw(callback, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffectOnce(
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useLayoutEffectRaw(callback, emptyArray())
}
