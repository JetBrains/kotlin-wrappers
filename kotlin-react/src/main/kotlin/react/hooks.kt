package react

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

typealias RDependenciesArray = Array<dynamic>
typealias RDependenciesList = List<dynamic>

typealias RSetState<T> = (value: T) -> Unit

fun <T> useState(initValue: T): ReadWriteProperty<Any?, T> =
    ReactStateDelegate(rawUseState(initValue))

fun <T> useState(valueInitializer: () -> T): ReadWriteProperty<Any?, T> =
    ReactStateDelegate(rawUseState(valueInitializer))

private class ReactStateDelegate<T>(
    stateTuple: RDependenciesArray
) : ReadWriteProperty<Any?, T> {
    private val state = stateTuple[0] as T
    private val setState = stateTuple[1] as RSetState<T>

    override operator fun getValue(thisRef: Any?, property: KProperty<*>): T =
        state

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        setState(value)
    }
}

typealias RReducer<S, A> = (state: S, action: A) -> S
typealias RDispatch<A> = (action: A) -> Unit

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

fun <S, A> useReducer(reducer: RReducer<S?, A>): Pair<S?, RDispatch<A>> {
    return useReducer(reducer, null)
}

typealias RCleanup = () -> Unit

fun useEffectWithCleanup(dependencies: RDependenciesList? = null, effect: () -> RCleanup) {
    rawUseEffect(effect, dependencies?.toTypedArray())
}

fun useEffect(dependencies: RDependenciesList? = null, effect: () -> Unit) {
    rawUseEffect(effect, dependencies?.toTypedArray())
}

fun useLayoutEffectWithCleanup(dependencies: RDependenciesList? = null, effect: () -> RCleanup) {
    rawUseLayoutEffect(effect, dependencies?.toTypedArray())
}

fun useLayoutEffect(dependencies: RDependenciesList? = null, effect: () -> Unit) {
    rawUseLayoutEffect(effect, dependencies?.toTypedArray())
}
