package react

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

typealias RDependenciesArray = Array<dynamic>
typealias RDependenciesList = List<dynamic>

typealias RSetState<T> = (value: T) -> Unit

fun <T> useState(initValue: T): RStateDelegate<T> {
    val (state, setState) = rawUseState(initValue)
    return RStateDelegate(
        state.unsafeCast<T>(),
        setState.unsafeCast<RSetState<T>>()
    )
}

fun <T> useState(valueInitializer: () -> T): RStateDelegate<T> {
    val (state, setState) = rawUseState(valueInitializer)
    return RStateDelegate(
        state.unsafeCast<T>(),
        setState.unsafeCast<RSetState<T>>()
    )
}

class RStateDelegate<T>
internal constructor(
    private val state: T,
    private val setState: RSetState<T>
) : ReadWriteProperty<Any?, T> {
    @Deprecated("Use delegate instead. Example: `var count by useState(13)`")
    operator fun component1(): T = state

    @Deprecated("Use delegate instead. Example: `var count by useState(42)`")
    operator fun component2(): RSetState<T> = setState

    override operator fun getValue(thisRef: Any?, property: KProperty<*>): T =
        state

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        setState(value)
    }
}

typealias RReducer<S, A> = (state: S, action: A) -> S
typealias RDispatch<A> = (action: A) -> Unit

fun <S, A> useReducer(reducer: RReducer<S, A>, initState: S, initialAction: A? = null): Pair<S, RDispatch<A>> {
    val (currentState, dispatch) = if (initialAction != null) {
        rawUseReducer(reducer, initState, initialAction)
    } else {
        rawUseReducer(reducer, initState)
    }
    return currentState.unsafeCast<S>() to dispatch.unsafeCast<RDispatch<A>>()
}

fun <S, A> useReducer(reducer: RReducer<S?, A>): Pair<S?, RDispatch<A>> {
    return useReducer(reducer, null)
}

typealias RCleanup = () -> Unit

fun useEffectWithCleanup(dependencies: RDependenciesList? = null, effect: () -> RCleanup) {
    if (dependencies != null) {
        rawUseEffect(effect, dependencies.toTypedArray())
    } else {
        rawUseEffect(effect)
    }
}

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

fun useLayoutEffectWithCleanup(dependencies: RDependenciesList? = null, effect: () -> RCleanup) {
    if (dependencies != null) {
        rawUseLayoutEffect(effect, dependencies.toTypedArray())
    } else {
        rawUseLayoutEffect(effect)
    }
}

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
