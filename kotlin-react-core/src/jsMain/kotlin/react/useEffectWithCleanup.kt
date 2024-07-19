package react

import react.internal.createCleanupCallback
import react.raw.rawUseEffect

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffectWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    rawUseEffect(callback)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffectWithCleanup(
    vararg dependencies: Any?,
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    rawUseEffect(callback, dependencies)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffectOnceWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    rawUseEffect(callback, emptyArray())
}
