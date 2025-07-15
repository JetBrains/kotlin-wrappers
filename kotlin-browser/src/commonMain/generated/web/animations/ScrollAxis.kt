// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import js.reflect.unsafeCast

sealed external interface ScrollAxis {
    companion object
}

inline val ScrollAxis.Companion.block: ScrollAxis
    get() = unsafeCast("block")

inline val ScrollAxis.Companion.inline: ScrollAxis
    get() = unsafeCast("inline")

inline val ScrollAxis.Companion.x: ScrollAxis
    get() = unsafeCast("x")

inline val ScrollAxis.Companion.y: ScrollAxis
    get() = unsafeCast("y")
