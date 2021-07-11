@file:JsModule("react")
@file:JsNonModule

package react

// Debug Value Hook (16.8+)
external fun <T : Any> useDebugValue(
    value: T,
    format: (value: T) -> Any = definedExternally,
)
