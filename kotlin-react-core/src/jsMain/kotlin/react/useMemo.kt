package react

import react.raw.useMemoRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useMemo)
 */
inline fun <T> useMemo(
    vararg dependencies: Any?,
    noinline callback: () -> T,
): T =
    useMemoRaw(callback, dependencies)
