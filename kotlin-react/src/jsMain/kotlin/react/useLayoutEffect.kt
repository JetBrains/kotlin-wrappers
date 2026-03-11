package react

import kotlinx.coroutines.CoroutineScope
import react.raw.invoke
import react.raw.useLayoutEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffect(
    effect: suspend CoroutineScope.() -> Unit,
) {
    useLayoutEffectRaw(effect)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffect(
    vararg dependencies: Any?,
    effect: suspend CoroutineScope.() -> Unit,
) {
    useLayoutEffectRaw(effect, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useLayoutEffect)
 */
fun useLayoutEffectOnce(
    effect: suspend CoroutineScope.() -> Unit,
) {
    useLayoutEffectRaw(effect, emptyArray())
}
