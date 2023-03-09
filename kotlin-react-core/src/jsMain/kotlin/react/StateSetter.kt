@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

// TODO: make external in IR
sealed class StateSetter<T> {
    inline operator fun invoke(
        value: T,
    ) {
        unsafeCast<SetValue<T>>()(value)
    }

    inline operator fun invoke(
        noinline transform: (T) -> T,
    ) {
        unsafeCast<TransformValue<T>>()(transform)
    }
}
