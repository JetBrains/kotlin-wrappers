@file:JsModule("react")
@file:JsNonModule

package react

external interface ProviderProps<T> : PropsWithChildren {
    var value: T
}

external interface Provider<T> : ComponentClass<ProviderProps<T>>

external interface ConsumerProps<T> : Props {
    var children: (T) -> ReactNode?
}

external interface Consumer<T> : ComponentClass<ConsumerProps<T>>

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
