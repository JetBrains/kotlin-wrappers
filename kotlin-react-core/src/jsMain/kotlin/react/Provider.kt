package react

external interface ProviderProps<T> : PropsWithChildren {
    var value: T
}

sealed external interface Provider<T> :
    ExoticComponent<ProviderProps<T>>
