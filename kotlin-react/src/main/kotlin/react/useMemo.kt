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
    rawUseMemo(callback, dependencies)

/**
 * Only works inside [functionalComponent]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
@Deprecated(
    message = "Inconsistent hooks API",
)
inline fun <T> useMemo(
    noinline callback: () -> T,
    dependencies: RDependenciesArray
): T =
    rawUseMemo(callback, dependencies)

