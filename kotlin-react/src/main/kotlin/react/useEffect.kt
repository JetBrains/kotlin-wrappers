package react

typealias RDependenciesArray = Array<out dynamic>

typealias Cleanup = () -> Unit

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffect(
    effect: EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseEffect(callback)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffect(
    vararg dependencies: dynamic,
    effect: EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseEffect(callback, dependencies)
}

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffectOnce(
    effect: EffectBuilder.() -> Unit,
) {
    val callback = createEffectCallback(effect)
    rawUseEffect(callback, emptyArray())
}
