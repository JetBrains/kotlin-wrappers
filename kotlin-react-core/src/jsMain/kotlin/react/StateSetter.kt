@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

// TODO: make external in IR
sealed class StateSetter<T> {
    inline val set: SetValue<T>
        get() = unsafeCast<SetValue<T>>()

    inline val transform: TransformValue<T>
        get() = unsafeCast<TransformValue<T>>()

    inline operator fun invoke(
        value: T,
    ) {
        set(value)
    }

    inline operator fun invoke(
        noinline transform: (T) -> T,
    ) {
        transform(transform)
    }
}
