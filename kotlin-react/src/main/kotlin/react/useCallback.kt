@file:Suppress("NOTHING_TO_INLINE")

package react

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
inline fun <T : Function<*>> useCallback(
    vararg dependencies: dynamic,
    callback: T,
): T =
    useCallback(callback, dependencies)
