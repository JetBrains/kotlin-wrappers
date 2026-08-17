// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AlphaOption

inline val AlphaOption.Companion.discard: AlphaOption
    get() = unsafeCast("discard")

inline val AlphaOption.Companion.keep: AlphaOption
    get() = unsafeCast("keep")
