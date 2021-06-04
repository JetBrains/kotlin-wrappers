@file:Suppress("NOTHING_TO_INLINE")

package react

typealias RDependenciesArray = Array<dynamic>

/**
 * @deprecated
 */
typealias RDependenciesList = List<dynamic>

typealias RReducer<S, A> = (state: S, action: A) -> S
typealias RDispatch<A> = (action: A) -> Unit

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun <S, A> useReducer(reducer: RReducer<S, A>, initState: S, initialAction: A? = null): Pair<S, RDispatch<A>> {
    val jsTuple = if (initialAction != null) {
        rawUseReducer(reducer, initState, initialAction)
    } else {
        rawUseReducer(reducer, initState)
    }
    val currentState = jsTuple[0] as S
    val dispatch = jsTuple[1] as RDispatch<A>
    return currentState to dispatch
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun <S, A> useReducer(reducer: RReducer<S?, A>): Pair<S?, RDispatch<A>> {
    return useReducer(reducer, null)
}

typealias RCleanup = () -> Unit

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API (use cleanup method in your effect and arrayOf or emptyArray for dependencies)",
)
fun useEffectWithCleanup(dependencies: RDependenciesList, effect: () -> RCleanup) {
    rawUseEffect(effect, dependencies.toTypedArray())
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API (use arrayOf or emptyArray for dependencies)",
)
fun useEffect(dependencies: RDependenciesList, effect: () -> Unit) {
    val rawEffect = {
        effect()
        undefined
    }
    rawUseEffect(rawEffect, dependencies.toTypedArray())
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API (use cleanup method in your effect and arrayOf or emptyArray for dependencies)",
)
fun useLayoutEffectWithCleanup(dependencies: RDependenciesList, effect: () -> RCleanup) {
    rawUseLayoutEffect(effect, dependencies.toTypedArray())
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API (use arrayOf or emptyArray for dependencies)",
)
fun useLayoutEffect(dependencies: RDependenciesList, effect: () -> Unit) {
    val rawEffect = {
        effect()
        undefined
    }
    rawUseLayoutEffect(rawEffect, dependencies.toTypedArray())
}

class EffectBuilder {
    var cleanupCallback: RCleanup? = undefined

    fun cleanup(callback: RCleanup) {
        cleanupCallback = callback
    }
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useEffect(dependencies: RDependenciesArray? = null, effect: EffectBuilder.() -> Unit) {
    val rawEffect = {
        with(EffectBuilder()) {
            effect()
            cleanupCallback
        }
    }

    if (dependencies != null) {
        rawUseEffect(rawEffect, dependencies)
    } else {
        rawUseEffect(rawEffect)
    }
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun useLayoutEffect(dependencies: RDependenciesArray? = null, effect: EffectBuilder.() -> Unit) {
    val rawEffect = {
        with(EffectBuilder()) {
            effect()
            cleanupCallback
        }
    }

    if (dependencies != null) {
        rawUseLayoutEffect(rawEffect, dependencies)
    } else {
        rawUseLayoutEffect(rawEffect)
    }
}

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
    replaceWith = ReplaceWith("useCallback(dependencies, callback)")
)
inline fun <T : Function<*>> useCallback(
    callback: T,
    dependencies: RDependenciesArray
): T =
    rawUseCallback(callback, dependencies)

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
    replaceWith = ReplaceWith("useCallback(arrayOf(*dependencies), callback)")
)
inline fun <T : Function<*>> useCallback(
    vararg dependencies: dynamic,
    callback: T,
): T =
    rawUseCallback(callback, dependencies)

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
inline fun <T : Function<*>> useCallback(
    dependencies: RDependenciesArray,
    callback: T,
): T =
    rawUseCallback(callback, dependencies)

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
    replaceWith = ReplaceWith("useMemo(dependencies, callback)")
)
inline fun <T> useMemo(
    noinline callback: () -> T,
    dependencies: RDependenciesArray
): T =
    rawUseMemo(callback, dependencies)

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
    replaceWith = ReplaceWith("useMemo(arrayOf(*dependencies), callback)")
)
inline fun <T> useMemo(
    vararg dependencies: dynamic,
    noinline callback: () -> T,
): T =
    rawUseMemo(callback, dependencies)

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
inline fun <T> useMemo(
    dependencies: RDependenciesArray,
    noinline callback: () -> T,
): T =
    rawUseMemo(callback, dependencies)
