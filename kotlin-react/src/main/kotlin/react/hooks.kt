package react

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

typealias RDependenciesArray = Array<dynamic>
typealias RDependenciesList = List<dynamic>

typealias RSetState<T> = (value: T) -> Unit

fun <T> useState(initValue: T): Pair<T, RSetState<T>> {
    val jsTuple = rawUseState(initValue)
    val currentValue = jsTuple[0] as T
    val setState = jsTuple[1] as RSetState<T>
    return currentValue to setState
}

fun <T> useState(valueInitializer: () -> T): Pair<T, RSetState<T>> {
    val jsTuple = rawUseState(valueInitializer)
    val currentValue = jsTuple[0] as T
    val setState = jsTuple[1] as RSetState<T>
    return currentValue to setState
}

private class ReactStateDelegate<T>(useState: Pair<T, RSetState<T>>) : ReadWriteProperty<Any?, T> {
    private val state = useState.first

    private val setState = useState.second

    override operator fun getValue(thisRef: Any?, property: KProperty<*>): T =
            state

    override operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        setState(value)
    }
}

fun <T> state(initValue: T): ReadWriteProperty<Any?, T> =
        ReactStateDelegate(useState(initValue))

fun <T> state(valueInitializer: () -> T): ReadWriteProperty<Any?, T> =
        ReactStateDelegate(useState(valueInitializer))

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
