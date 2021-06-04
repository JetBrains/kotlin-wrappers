package react

typealias RReducer<S, A> = (state: S, action: A) -> S
typealias RDispatch<A> = (action: A) -> Unit

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
fun <S, A> useReducer(
    reducer: RReducer<S, A>,
    initState: S,
    initialAction: A? = null,
): Pair<S, RDispatch<A>> {
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
fun <S, A> useReducer(
    reducer: RReducer<S?, A>,
): Pair<S?, RDispatch<A>> {
    return useReducer(reducer, null)
}
