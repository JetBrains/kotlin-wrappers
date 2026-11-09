// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiSelectable)
 */
@JsUnion
sealed /* union */
external interface AriaMultiSelectable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiSelectable#false)
 */
inline val AriaMultiSelectable.Companion.`false`: AriaMultiSelectable
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiSelectable#true)
 */
inline val AriaMultiSelectable.Companion.`true`: AriaMultiSelectable
    get() = unsafeCast("true")
