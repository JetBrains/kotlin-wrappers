package react

external interface ProviderProps<T> :
    PropsWithChildren,
    PropsWithValue<T>

sealed external interface Provider<T> :
    ExoticComponent<ProviderProps<T>>
