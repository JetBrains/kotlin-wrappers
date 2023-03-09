@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

// TODO: make external in IR
sealed class StateSetter<T> {
    inline operator fun invoke(
        value: T,
    ) {
        asDynamic()(value)
    }

    inline operator fun invoke(
        noinline transform: (T) -> T,
    ) {
        asDynamic()(transform)
    }
}
