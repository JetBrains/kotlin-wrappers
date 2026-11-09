// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaExpanded)
 */
@JsUnion
sealed /* union */
external interface AriaExpanded

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaExpanded#false)
 */
inline val AriaExpanded.Companion.`false`: AriaExpanded
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaExpanded#true)
 */
inline val AriaExpanded.Companion.`true`: AriaExpanded
    get() = unsafeCast("true")
