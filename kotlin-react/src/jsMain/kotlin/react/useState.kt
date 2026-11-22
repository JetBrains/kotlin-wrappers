package react

import react.raw.useStateRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
inline fun <T : Any> useState(): StateInstance<T?> =
    useStateRaw()

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
inline fun <T> useState(
    initialValue: T,
): StateInstance<T> =
    useStateRaw(initialValue)

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
inline fun <T> useState(
    noinline initializer: () -> T,
): StateInstance<T> =
    useStateRaw(initializer)
