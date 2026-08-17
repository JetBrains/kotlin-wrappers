// Automatically generated - do not modify!

package web.mediasource

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AppendMode

inline val AppendMode.Companion.segments: AppendMode
    get() = unsafeCast("segments")

inline val AppendMode.Companion.sequence: AppendMode
    get() = unsafeCast("sequence")
