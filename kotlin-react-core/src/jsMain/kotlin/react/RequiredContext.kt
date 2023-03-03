package react

// Context (16.3+)
sealed external interface RequiredContext<T : Any> {
    val Provider: Provider<T>
}
