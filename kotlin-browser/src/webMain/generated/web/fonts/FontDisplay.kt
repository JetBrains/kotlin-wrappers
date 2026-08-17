// Automatically generated - do not modify!

package web.fonts

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FontDisplay

inline val FontDisplay.Companion.auto: FontDisplay
    get() = unsafeCast("auto")

inline val FontDisplay.Companion.block: FontDisplay
    get() = unsafeCast("block")

inline val FontDisplay.Companion.fallback: FontDisplay
    get() = unsafeCast("fallback")

inline val FontDisplay.Companion.optional: FontDisplay
    get() = unsafeCast("optional")

inline val FontDisplay.Companion.swap: FontDisplay
    get() = unsafeCast("swap")
