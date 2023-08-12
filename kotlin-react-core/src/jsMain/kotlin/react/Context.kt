package react

// Context (16.3+)
sealed external interface Context<T> :
    ContextType<T> {
    val Consumer: Consumer<T>
}
