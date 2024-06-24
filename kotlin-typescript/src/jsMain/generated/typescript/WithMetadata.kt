// Automatically generated - do not modify!

package typescript


sealed external interface WithMetadata<T> {
    var metadata: Any?

    @Suppress(
        "WRONG_BODY_OF_EXTERNAL_DECLARATION",
        "INLINE_EXTERNAL_DECLARATION",
        "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
        "DECLARATION_CANT_BE_INLINED",
    )
    inline val value: T
        get() = unsafeCast<T>()
}
