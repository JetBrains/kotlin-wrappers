package kotlinx.js

external interface ArrayLike<out T> {
    val length: Int
}

inline operator fun <T> ArrayLike<T>.get(
    index: Int,
): T =
    asDynamic()[index]
