@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/createContext)
 */
external fun <T : Any> createContext(): Context<T?>

/**
 * [Online Documentation](https://react.dev/reference/react/createContext)
 */
external fun <T> createContext(
    defaultValue: T,
): Context<T>
