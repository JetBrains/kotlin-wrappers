package react

import js.reflect.unsafeCast

/**
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
inline fun <T : Any> useRefValue(): RefValueInstance<T?> =
    unsafeCast(useRef<T>())

/**
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
inline fun <T : Any> useRefValue(
    initialValue: T,
): RefValueInstance<T> =
    unsafeCast(useRef(initialValue))
