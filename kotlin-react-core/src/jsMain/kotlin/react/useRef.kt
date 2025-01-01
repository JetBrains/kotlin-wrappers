@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/useRef)
 */
external fun <T : Any> useRef(
    initialValue: T? = definedExternally,
): MutableRefObject<T>
