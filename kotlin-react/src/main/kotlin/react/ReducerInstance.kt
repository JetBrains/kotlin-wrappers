@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlinext.js.Tuple

typealias RReducer<S, A> = (state: S, action: A) -> S
typealias RDispatch<A> = (action: A) -> Unit

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
typealias ReducerInstance<S, A> = Tuple<S, RDispatch<A>>
