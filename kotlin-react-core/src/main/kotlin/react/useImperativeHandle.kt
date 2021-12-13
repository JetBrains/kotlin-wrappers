@file:Suppress("NOTHING_TO_INLINE")

package react

/**
 * Available since 16.8
 *
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
inline fun <T : Any> useImperativeHandle(
    ref: Ref<T>?,
    vararg dependencies: dynamic,
    noinline init: () -> T?,
) =
    rawUseImperativeHandle(ref, init, dependencies)
