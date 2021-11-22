@file:JsModule("react")
@file:JsNonModule

package react

external interface ProviderProps<T> : PropsWithChildren {
    var value: T
}

sealed external interface Provider<T> : ComponentType<ProviderProps<T>>

external interface ConsumerProps<T> : Props {
    var children: (T) -> ReactNode?
}

sealed external interface Consumer<T> : ComponentType<ConsumerProps<T>>

// Context (16.3+)
sealed external interface Context<T> {
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
