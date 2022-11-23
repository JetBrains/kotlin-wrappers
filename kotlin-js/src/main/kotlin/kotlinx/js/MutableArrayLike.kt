package kotlinx.js

external interface MutableArrayLike<T> : ArrayLike<T>

inline operator fun <T> MutableArrayLike<T>.set(
    index: Int,
    value: T,
) {
    asDynamic()[index] = value
}
