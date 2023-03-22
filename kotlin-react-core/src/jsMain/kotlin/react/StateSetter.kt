package react

sealed external interface StateSetter<T> {
    @nativeInvoke
    @Suppress("DEPRECATION")
    operator fun invoke(
        value: T,
    )

    @nativeInvoke
    @Suppress("DEPRECATION")
    operator fun invoke(
        transform: (T) -> T,
    )
}
