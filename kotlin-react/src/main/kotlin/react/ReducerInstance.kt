@file:Suppress("NOTHING_TO_INLINE")

package react

import kotlinext.js.Tuple

typealias Reducer<S, A> = (state: S, action: A) -> S
typealias Dispatch<A> = (action: A) -> Unit

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Reducer", "react.Reducer"),
)
typealias RReducer<S, A> = Reducer<S, A>

@Deprecated(
    message = "Legacy type alias",
    replaceWith = ReplaceWith("Dispatch", "react.Dispatch"),
)
typealias RDispatch<A> = Dispatch<A>

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
typealias ReducerInstance<S, A> = Tuple<S, Dispatch<A>>
