package react

import react.internal.createEffectCallback

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useInsertionEffect(
    effect: suspend EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseInsertionEffect(callback)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useInsertionEffect(
    vararg dependencies: Any?,
    effect: suspend EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseInsertionEffect(callback, dependencies)
}
