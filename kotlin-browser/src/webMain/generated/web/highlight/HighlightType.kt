// Automatically generated - do not modify!

package web.highlight

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/type)
 */
@JsUnion
sealed /* union */
external interface HighlightType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/type#grammar-error)
 */
inline val HighlightType.Companion.grammarError: HighlightType
    get() = unsafeCast("grammar-error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/type#highlight)
 */
inline val HighlightType.Companion.highlight: HighlightType
    get() = unsafeCast("highlight")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Highlight/type#spelling-error)
 */
inline val HighlightType.Companion.spellingError: HighlightType
    get() = unsafeCast("spelling-error")
