package react

import react.internal.createCleanupCallback
import react.raw.useLayoutEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffect(
    effect: suspend CleanupScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useLayoutEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffect(
    vararg dependencies: Any?,
    effect: suspend CleanupScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useLayoutEffectRaw(callback, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffectOnce(
    effect: suspend CleanupScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useLayoutEffectRaw(callback, emptyArray())
}
