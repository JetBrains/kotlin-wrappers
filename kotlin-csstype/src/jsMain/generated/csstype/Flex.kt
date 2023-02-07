// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""(/*union*/{content: 'content', fitContent: 'fit-content', maxContent: 'max-content', minContent: 'min-content'}/*union*/)""")
sealed external interface Flex {
    companion object {
        val content: Flex
        val fitContent: Flex
        val maxContent: Flex
        val minContent: Flex
    }
}

inline fun Flex(
    grow: FlexGrow,
    basis: FlexBasis,
): Flex =
    "$grow $basis".unsafeCast<Flex>()

inline fun Flex(
    grow: FlexGrow,
    shrink: FlexShrink,
): Flex =
    "$grow $shrink".unsafeCast<Flex>()

inline fun Flex(
    grow: FlexGrow,
    shrink: FlexShrink,
    basis: FlexBasis,
): Flex =
    "$grow $shrink $basis".unsafeCast<Flex>()
