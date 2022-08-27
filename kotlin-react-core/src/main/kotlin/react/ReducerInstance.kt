package react

import kotlinx.js.JsTuple2

typealias Reducer<S, A> = (state: S, action: A) -> S
typealias Dispatch<A> = (action: A) -> Unit

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
typealias ReducerInstance<S, A> = JsTuple2<S, Dispatch<A>>
