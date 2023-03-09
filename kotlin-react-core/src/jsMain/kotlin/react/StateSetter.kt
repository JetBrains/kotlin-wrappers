@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react

// TODO: make external in IR
class StateSetter<T>
private constructor() {
    inline operator fun invoke(value: T) {
        asDynamic()(value)
    }

    inline operator fun invoke(noinline transform: (T) -> T) {
        asDynamic()(transform)
    }
}
