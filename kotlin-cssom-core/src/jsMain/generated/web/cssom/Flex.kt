// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface Flex {
    companion object {
        @JsValue("content")
        val content: Flex

        @JsValue("fit-content")
        val fitContent: Flex

        @JsValue("max-content")
        val maxContent: Flex

        @JsValue("min-content")
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
