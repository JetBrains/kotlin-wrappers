package react

import react.raw.invoke
import react.raw.useLayoutEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffect(
    effect: suspend CleanupScope.() -> Unit,
) {
    useLayoutEffectRaw(effect)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffect(
    vararg dependencies: Any?,
    effect: suspend CleanupScope.() -> Unit,
) {
    useLayoutEffectRaw(effect, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffectOnce(
    effect: suspend CleanupScope.() -> Unit,
) {
    useLayoutEffectRaw(effect, emptyArray())
}
