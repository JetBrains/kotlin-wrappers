package js.typedarrays

import seskar.js.JsSpecialName

// language=typescript
@JsSpecialName("(Object.getPrototypeOf(Uint8Array).constructor)")
sealed external class TypedArrayCompanion<S : TypedArray<S, T>, T : Comparable<T> /* Number? */> {
    val BYTES_PER_ELEMENT: Int

    fun of(
        vararg items: T,
    ): S
}
