@file:JsModule("react")
@file:JsNonModule

package react

external interface ProviderProps<T> : RProps {
    var value: T
}

external interface Provider<T> : RClass<ProviderProps<T>>

external interface ConsumerProps<T> : RProps {
    var children: (T) -> Any
}

external interface Consumer<T> : RClass<ConsumerProps<T>>

// Context (16.3+)
external interface Context<T> {
    val Provider: Provider<T>
    val Consumer: Consumer<T>
}

// Context (16.3+)
external fun <T> createContext(
    defaultValue: T = definedExternally,
): Context<T>

// Context Hook (16.8+)
external fun <T> useContext(
    context: Context<T>,
): T
