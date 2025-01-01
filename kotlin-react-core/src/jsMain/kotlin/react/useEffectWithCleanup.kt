package react

import react.internal.buildCleanupCallback
import react.raw.useEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffectWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffectWithCleanup(
    vararg dependencies: Any?,
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useEffectRaw(callback, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffectOnceWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useEffectRaw(callback, emptyArray())
}
