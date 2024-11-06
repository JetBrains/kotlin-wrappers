// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast
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
    unsafeCast("$grow $basis")

inline fun Flex(
    grow: FlexGrow,
    shrink: FlexShrink,
): Flex =
    unsafeCast("$grow $shrink")

inline fun Flex(
    grow: FlexGrow,
    shrink: FlexShrink,
    basis: FlexBasis,
): Flex =
    unsafeCast("$grow $shrink $basis")
