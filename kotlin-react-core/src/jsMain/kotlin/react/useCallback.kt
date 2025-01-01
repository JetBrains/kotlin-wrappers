package react

import react.raw.useCallbackRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useCallback)
 */
inline fun <T : Function<*>> useCallback(
    vararg dependencies: Any?,
    callback: T,
): T =
    useCallbackRaw(callback, dependencies)
