package react

import kotlinx.coroutines.CoroutineScope
import react.raw.invoke
import react.raw.useEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffect(
    effect: suspend CoroutineScope.() -> Unit,
) {
    useEffectRaw(effect)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffect(
    vararg dependencies: Any?,
    effect: suspend CoroutineScope.() -> Unit,
) {
    useEffectRaw(effect, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
fun useEffectOnce(
    effect: suspend CoroutineScope.() -> Unit,
) {
    useEffectRaw(effect, emptyArray())
}
