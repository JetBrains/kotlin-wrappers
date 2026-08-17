// Automatically generated - do not modify!

package web.canvas

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CanvasLineJoin

inline val CanvasLineJoin.Companion.bevel: CanvasLineJoin
    get() = unsafeCast("bevel")

inline val CanvasLineJoin.Companion.miter: CanvasLineJoin
    get() = unsafeCast("miter")

inline val CanvasLineJoin.Companion.round: CanvasLineJoin
    get() = unsafeCast("round")
