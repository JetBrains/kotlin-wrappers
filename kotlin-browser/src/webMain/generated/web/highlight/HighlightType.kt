// Automatically generated - do not modify!

package web.highlight

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface HighlightType

inline val HighlightType.Companion.grammarError: HighlightType
    get() = unsafeCast("grammar-error")

inline val HighlightType.Companion.highlight: HighlightType
    get() = unsafeCast("highlight")

inline val HighlightType.Companion.spellingError: HighlightType
    get() = unsafeCast("spelling-error")
