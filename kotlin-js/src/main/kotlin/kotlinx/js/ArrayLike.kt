package kotlinx.js

external interface ArrayLike<out T> {
    val length: Int
}

inline operator fun <T> ArrayLike<T>.get(
    index: Int,
): T =
    asDynamic()[index]

fun <T> ArrayLike<T>.asList(): List<T> =
    object : AbstractList<T>() {
        override val size: Int
            get() = this@asList.length

        override fun get(index: Int): T =
            when (index) {
                in 0..lastIndex -> this@asList[index]
                else -> throw IndexOutOfBoundsException("index $index is not in range [0..$lastIndex]")
            }
    }
