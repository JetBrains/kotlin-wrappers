package react

sealed external interface ContextType<T> :
    Provider<T>,
    HasDisplayName {
    val Provider: Provider<T>
}
