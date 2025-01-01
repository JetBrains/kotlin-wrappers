package react

import react.internal.buildCleanupCallback
import react.raw.useLayoutEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffectWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useLayoutEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffectWithCleanup(
    vararg dependencies: Any?,
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useLayoutEffectRaw(callback, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffectOnceWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useLayoutEffectRaw(callback, emptyArray())
}
