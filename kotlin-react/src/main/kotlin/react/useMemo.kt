@file:Suppress("NOTHING_TO_INLINE")

package react

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
inline fun <T> useMemo(
    vararg dependencies: dynamic,
    noinline callback: () -> T,
): T =
    useMemo(callback, dependencies)
