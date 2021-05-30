@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlin.reflect.KProperty

typealias RDependenciesArray = Array<dynamic>
typealias RDependenciesList = List<dynamic>

typealias RSetState<T> = (value: T) -> Unit

/**
 * Only works inside [functionalComponent]
 * @see https://reactjs.org/docs/hooks-state.html
 */
// TODO: make external in IR
class RStateDelegate<T>
private constructor() {
    inline operator fun component1(): T = asDynamic()[0]
    inline operator fun component2(): RSetState<T> = asDynamic()[1]

    inline operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>
    ): T =
        asDynamic()[0]

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T
    ) {
        asDynamic()[1](value)
    }
}

typealias RReducer<S, A> = (state: S, action: A) -> S
typealias RDispatch<A> = (action: A) -> Unit

/**
 * Only works inside [functionalComponent]
 * @see https://reactjs.org/docs/hooks-state.html
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
 * @see https://reactjs.org/docs/hooks-state.html
 */
fun <S, A> useReducer(reducer: RReducer<S?, A>): Pair<S?, RDispatch<A>> {
    return useReducer(reducer, null)
}

typealias RCleanup = () -> Unit

/**
 * Only works inside [functionalComponent]
 * @see https://reactjs.org/docs/hooks-state.html
 */
fun useEffectWithCleanup(dependencies: RDependenciesList? = null, effect: () -> RCleanup) {
    if (dependencies != null) {
        rawUseEffect(effect, dependencies.toTypedArray())
    } else {
        rawUseEffect(effect)
    }
}

/**
 * Only works inside [functionalComponent]
 * @see https://reactjs.org/docs/hooks-state.html
 */
fun useEffect(dependencies: RDependenciesList? = null, effect: () -> Unit) {
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

/**
 * Only works inside [functionalComponent]
 * @see https://reactjs.org/docs/hooks-state.html
 */
fun useLayoutEffectWithCleanup(dependencies: RDependenciesList? = null, effect: () -> RCleanup) {
    if (dependencies != null) {
        rawUseLayoutEffect(effect, dependencies.toTypedArray())
    } else {
        rawUseLayoutEffect(effect)
    }
}

/**
 * Only works inside [functionalComponent]
 * @see https://reactjs.org/docs/hooks-state.html
 */
fun useLayoutEffect(dependencies: RDependenciesList? = null, effect: () -> Unit) {
    val rawEffect = {
        effect()
        undefined
    }
    if (dependencies != null) {
        rawUseLayoutEffect(rawEffect, dependencies.toTypedArray())
    } else {
        rawUseLayoutEffect(rawEffect)
    }
}

/**
 * Only works inside [functionalComponent]
 * @see https://reactjs.org/docs/hooks-state.html
 */
inline fun <T : Function<*>> useCallback(
    vararg dependencies: dynamic,
    callback: T,
): T =
    useCallback(callback, dependencies)

/**
 * Only works inside [functionalComponent]
 * @see https://reactjs.org/docs/hooks-state.html
 */
inline fun <T> useMemo(
    vararg dependencies: dynamic,
    noinline callback: () -> T,
): T =
    useMemo(callback, dependencies)
