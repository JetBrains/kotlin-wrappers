// Automatically generated - do not modify!

package web.mediasource

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/mode)
 */
@JsUnion
sealed /* union */
external interface AppendMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/mode#segments)
 */
inline val AppendMode.Companion.segments: AppendMode
    get() = unsafeCast("segments")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/mode#sequence)
 */
inline val AppendMode.Companion.sequence: AppendMode
    get() = unsafeCast("sequence")
