package js.core

external interface MutableArrayLike<T> : ArrayLike<T> {
    @nativeSetter
    @Suppress(
        "DEPRECATION",
        "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    )
    operator fun set(
        index: Int,
        value: T,
    ): Unit = definedExternally
}
