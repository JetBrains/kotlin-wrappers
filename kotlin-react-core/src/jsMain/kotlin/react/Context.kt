package react

// Context (16.3+)
sealed external interface Context<T> {
    val Provider: Provider<T>
    val Consumer: Consumer<T>
}
