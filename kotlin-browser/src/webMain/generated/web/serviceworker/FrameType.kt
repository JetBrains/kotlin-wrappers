// Automatically generated - do not modify!

package web.serviceworker

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FrameType

inline val FrameType.Companion.auxiliary: FrameType
    get() = unsafeCast("auxiliary")

inline val FrameType.Companion.nested: FrameType
    get() = unsafeCast("nested")

inline val FrameType.Companion.none: FrameType
    get() = unsafeCast("none")

inline val FrameType.Companion.topLevel: FrameType
    get() = unsafeCast("top-level")
