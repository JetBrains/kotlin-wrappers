package react

/**
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
inline fun <T : Any> useRefValue(): RefValueInstance<T?> =
    RefValueInstance(useRef())

/**
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
inline fun <T : Any> useRefValue(
    initialValue: T,
): RefValueInstance<T> =
    RefValueInstance(useRef(initialValue))
