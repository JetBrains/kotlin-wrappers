@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package js.typedarrays

// language=typescript
@JsName("(Object.getPrototypeOf(Uint8Array).constructor)")
sealed external class TypedArrayCompanion<S : TypedArray<S, T>, T : Comparable<T> /* Number? */> {
    val BYTES_PER_ELEMENT: Int

    fun of(
        vararg items: T,
    ): S
}
