@file:JsModule("react")
@file:JsNonModule

package react

external interface RProviderProps<T> : RProps {
    var value: T
}

external interface RProvider<T> : RClass<RProviderProps<T>>

external interface RConsumerProps<T> : RProps {
    var children: (T) -> Any
}

external interface RConsumer<T> : RClass<RConsumerProps<T>>

// Context (16.3+)
external interface RContext<T> {
    val Provider: RProvider<T>
    val Consumer: RConsumer<T>
}

// Context (16.3+)
external fun <T> createContext(
    defaultValue: T = definedExternally,
): RContext<T>

// Context Hook (16.8+)
external fun <T> useContext(
    context: RContext<T>,
): T
