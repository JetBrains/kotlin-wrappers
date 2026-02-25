@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/useDeferredValue)
 */
external fun <T> useDeferredValue(
    value: T,
    initialValue: T = definedExternally,
): T
