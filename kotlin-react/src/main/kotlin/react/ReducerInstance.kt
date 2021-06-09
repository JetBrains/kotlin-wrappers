@file:Suppress("NOTHING_TO_INLINE")

package react

typealias RReducer<S, A> = (state: S, action: A) -> S
typealias RDispatch<A> = (action: A) -> Unit

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
// TODO: make external in IR
class ReducerInstance<S, A>
private constructor() {
    inline operator fun component1(): S = asDynamic()[0]
    inline operator fun component2(): RDispatch<A> = asDynamic()[1]
}
