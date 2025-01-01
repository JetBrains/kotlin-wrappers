@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
external fun <T : Any> useState(): StateInstance<T?>

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
external fun <T> useState(
    initialValue: T,
): StateInstance<T>

/**
 * [Online Documentation](https://react.dev/reference/react/useState)
 */
external fun <T> useState(
    initializer: () -> T,
): StateInstance<T>
