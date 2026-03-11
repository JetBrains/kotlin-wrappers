package react

import kotlinx.coroutines.CoroutineScope
import react.raw.invoke
import react.raw.useInsertionEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffect(
    effect: suspend CoroutineScope.() -> Unit,
) {
    useInsertionEffectRaw(effect)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffect(
    vararg dependencies: Any?,
    effect: suspend CoroutineScope.() -> Unit,
) {
    useInsertionEffectRaw(effect, dependencies)
}
