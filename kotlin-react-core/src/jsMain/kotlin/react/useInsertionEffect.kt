package react

import kotlinx.coroutines.CoroutineScope
import react.internal.createCleanupCallback
import react.raw.useInsertionEffectRaw

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useInsertionEffect(
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useInsertionEffectRaw(callback)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useInsertionEffect(
    vararg dependencies: Any?,
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useInsertionEffectRaw(callback, dependencies)
}
