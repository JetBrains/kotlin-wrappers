package react

typealias RDependenciesArray = Array<dynamic>
typealias RDependenciesList = List<dynamic>

typealias RCleanup = () -> Unit

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
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
fun useEffect(
    dependencies: RDependenciesList? = null,
    effect: () -> Unit,
) {
    val rawEffect = {
        effect()
        undefined
    }
    if (dependencies != null) {
        rawUseEffect(rawEffect, dependencies.toTypedArray())
    } else {
        rawUseEffect(rawEffect)
    }
}
