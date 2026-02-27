@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
@JsName("useRef")
external fun <T : Any> useRefValue(): RefValueInstance<T?>

/**
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
@JsName("useRef")
external fun <T : Any> useRefValue(
    initialValue: T,
): RefValueInstance<T>
