// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import js.reflect.unsafeCast

sealed external interface CanvasLineJoin {
    companion object
}

inline val CanvasLineJoin.Companion.bevel: CanvasLineJoin
    get() = unsafeCast("bevel")

inline val CanvasLineJoin.Companion.miter: CanvasLineJoin
    get() = unsafeCast("miter")

inline val CanvasLineJoin.Companion.round: CanvasLineJoin
    get() = unsafeCast("round")
