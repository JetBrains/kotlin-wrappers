@file:JsModule("react")
@file:JsNonModule

package react

// Context (16.3+)
external fun <T : Any> createContext(): Context<T?>

external fun <T> createContext(
    defaultValue: T,
): Context<T>
