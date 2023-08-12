package react

sealed external interface ContextType<T> :
    HasDisplayName {
    val Provider: Provider<T>
}
