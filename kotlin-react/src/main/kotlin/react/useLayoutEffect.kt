package react

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffect(
    effect: EffectBuilder.() -> Unit,
) {
    val effectCallback = useEffectCallback(effect)
    rawUseLayoutEffect(effectCallback)
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffect(
    vararg dependencies: dynamic,
    effect: EffectBuilder.() -> Unit,
) {
    val effectCallback = useEffectCallback(effect)
    rawUseLayoutEffect(effectCallback, dependencies)
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffectOnce(
    effect: EffectBuilder.() -> Unit,
) {
    val effectCallback = useEffectCallback(effect)
    rawUseLayoutEffect(effectCallback, emptyArray())
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
)
fun useLayoutEffectWithCleanup(
    dependencies: RDependenciesList? = null,
    effect: () -> RCleanup,
) {
    if (dependencies != null) {
        rawUseLayoutEffect(effect, dependencies.toTypedArray())
    } else {
        rawUseLayoutEffect(effect)
    }
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
)
fun useLayoutEffect(
    dependencies: RDependenciesList? = null,
    effect: EffectBuilder.() -> Unit,
) {
    val effectCallback = useEffectCallback(effect)
    if (dependencies != null) {
        rawUseLayoutEffect(effectCallback, dependencies.toTypedArray())
    } else {
        rawUseLayoutEffect(effectCallback)
    }
}
