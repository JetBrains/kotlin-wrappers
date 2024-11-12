package js.typedarrays

import js.array.ArrayLike
import js.buffer.ArrayBuffer
import seskar.js.JsSpecialName

// language=javascript
@JsSpecialName("(Object.getPrototypeOf(Uint8Array).constructor)")
sealed external class TypedArrayCompanion<S : TypedArray<S, S, ArrayBuffer, T>, T : Comparable<T> /* Number? */> {
    val BYTES_PER_ELEMENT: Int

    fun of(
        vararg items: T,
    ): S

    fun <T> from(
        source: ArrayLike<T>,
    ): S

    fun <U> from(
        source: ArrayLike<U>,
        transform: (item: U, index: Int) -> T,
    ): S
}
