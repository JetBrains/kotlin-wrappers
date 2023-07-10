package js.typedarrays

@JsName("DONT_USE_IS_AS_OPERATORS_WITH_SYNTHETIC_TYPED_ARRAY_COMPANION")
sealed external class TypedArrayCompanion<S : TypedArray<S, T>, T : Any /* Number */> {
    val BYTES_PER_ELEMENT: Int

    fun of(vararg items: T): S
}
