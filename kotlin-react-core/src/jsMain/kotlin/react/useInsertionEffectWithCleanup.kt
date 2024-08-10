package react

import react.internal.createCleanupCallback
import react.raw.useInsertionEffectRaw

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useInsertionEffectWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useInsertionEffectRaw(callback)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useInsertionEffectWithCleanup(
    vararg dependencies: Any?,
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    useInsertionEffectRaw(callback, dependencies)
}
