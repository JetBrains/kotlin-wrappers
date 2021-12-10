@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlinext.js.JsPair

typealias Reducer<S, A> = (state: S, action: A) -> S
typealias Dispatch<A> = (action: A) -> Unit

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
typealias ReducerInstance<S, A> = JsPair<S, Dispatch<A>>
