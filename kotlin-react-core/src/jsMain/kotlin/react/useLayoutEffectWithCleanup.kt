package react

import react.internal.createCleanupCallback
import react.raw.rawUseLayoutEffect

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffectWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    rawUseLayoutEffect(callback)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffectWithCleanup(
    vararg dependencies: Any?,
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    rawUseLayoutEffect(callback, dependencies)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffectOnceWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    rawUseLayoutEffect(callback, emptyArray())
}
