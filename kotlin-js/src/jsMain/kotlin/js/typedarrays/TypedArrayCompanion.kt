package js.typedarrays

sealed external class TypedArrayCompanion<S : TypedArray<S, T>, T : Comparable<T> /* Number? */> {
    val BYTES_PER_ELEMENT: Int

    fun of(
        vararg items: T,
    ): S
}
