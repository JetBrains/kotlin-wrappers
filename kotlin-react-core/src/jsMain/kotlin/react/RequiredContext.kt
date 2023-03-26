package react

// Context (16.3+)
sealed external interface RequiredContext<T : Any> :
    HasDisplayName {
    val Provider: Provider<T>
}
