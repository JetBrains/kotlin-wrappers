@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/useDebugValue)
 */
external fun <T : Any> useDebugValue(
    value: T,
    format: (value: T) -> Any = definedExternally,
)
