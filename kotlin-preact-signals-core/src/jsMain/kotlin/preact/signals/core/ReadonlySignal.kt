package preact.signals.core

/**
 * An interface for read-only signals.
 */
sealed external interface ReadonlySignal<out T> {
    val value: T
    fun subscribe(
        fn: (value: T) -> Unit,
    ): () -> Unit

    fun valueOf(): T
    fun toJSON(): T
    fun peek(): T
    val brand: BRAND_SYMBOL
}
