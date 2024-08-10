@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

import react.raw.useMemoRaw

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
inline fun <T> useMemo(
    vararg dependencies: Any?,
    noinline callback: () -> T,
): T =
    useMemoRaw(callback, dependencies)
