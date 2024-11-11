package js.typedarrays

import js.buffer.ArrayBuffer
import seskar.js.JsSpecialName

// language=javascript
@JsSpecialName("(Object.getPrototypeOf(Uint8Array).constructor)")
sealed external class TypedArrayCompanion<S : TypedArray<S, ArrayBuffer, T>, T : Comparable<T> /* Number? */> {
    val BYTES_PER_ELEMENT: Int

    fun of(
        vararg items: T,
    ): S
}
