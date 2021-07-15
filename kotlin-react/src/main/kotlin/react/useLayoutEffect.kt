package react

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffect(
    effect: EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseLayoutEffect(callback)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffect(
    vararg dependencies: dynamic,
    effect: EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseLayoutEffect(callback, dependencies)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffectOnce(
    effect: EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseLayoutEffect(callback, emptyArray())
}
