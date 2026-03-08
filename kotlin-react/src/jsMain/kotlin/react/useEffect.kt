package react

import react.raw.invoke
import react.raw.useEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffect(
    effect: suspend CleanupScope.() -> Unit,
) {
    useEffectRaw(effect)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffect(
    vararg dependencies: Any?,
    effect: suspend CleanupScope.() -> Unit,
) {
    useEffectRaw(effect, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffectOnce(
    effect: suspend CleanupScope.() -> Unit,
) {
    useEffectRaw(effect, emptyArray())
}
