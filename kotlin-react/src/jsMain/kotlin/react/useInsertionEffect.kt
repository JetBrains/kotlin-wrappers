package react

import react.raw.invoke
import react.raw.useInsertionEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffect(
    effect: suspend CleanupScope.() -> Unit,
) {
    useInsertionEffectRaw(effect)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useInsertionEffect)
 */
fun useInsertionEffect(
    vararg dependencies: Any?,
    effect: suspend CleanupScope.() -> Unit,
) {
    useInsertionEffectRaw(effect, dependencies)
}
