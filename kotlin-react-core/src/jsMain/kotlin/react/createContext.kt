@file:JsModule("react")
@file:JsNonModule

package react

// Context (16.3+)
external fun <T> createContext(
    defaultValue: T = definedExternally,
): Context<T>
