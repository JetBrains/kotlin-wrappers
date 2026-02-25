package react

sealed external interface StateSetter<T> {
    operator fun invoke(
        value: T,
    )

    operator fun invoke(
        transform: (T) -> T,
    )
}
