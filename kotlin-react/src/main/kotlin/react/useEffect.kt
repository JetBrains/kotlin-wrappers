package react

typealias RDependenciesArray = Array<dynamic>
typealias RDependenciesList = List<dynamic>

typealias RCleanup = () -> Unit

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffect(
    effect: EffectBuilder.() -> Unit,
) {
    val effectCallback = useEffectCallback(effect)
    rawUseEffect(effectCallback)
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffect(
    vararg dependencies: dynamic,
    effect: EffectBuilder.() -> Unit,
) {
    val effectCallback = useEffectCallback(effect)
    rawUseEffect(effectCallback, dependencies)
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffectOnce(
    effect: EffectBuilder.() -> Unit,
) {
    val effectCallback = useEffectCallback(effect)
    rawUseEffect(effectCallback, emptyArray())
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
)
fun useEffectWithCleanup(
    dependencies: RDependenciesList? = null,
    effect: () -> RCleanup,
) {
    if (dependencies != null) {
        rawUseEffect(effect, dependencies.toTypedArray())
    } else {
        rawUseEffect(effect)
    }
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
)
fun useEffect(
    dependencies: RDependenciesList? = null,
    effect: EffectBuilder.() -> Unit,
) {
    val effectCallback = useEffectCallback(effect)
    if (dependencies != null) {
        rawUseEffect(effectCallback, dependencies.toTypedArray())
    } else {
        rawUseEffect(effectCallback)
    }
}
