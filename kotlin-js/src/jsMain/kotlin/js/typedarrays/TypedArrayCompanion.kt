@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.typedarrays

sealed external interface TypedArrayCompanion<S : TypedArray<S, T>, T : Comparable<T> /* Number? */> {
    val BYTES_PER_ELEMENT: Int
        get() = definedExternally

    fun of(
        vararg items: T,
    ): S = definedExternally
}
