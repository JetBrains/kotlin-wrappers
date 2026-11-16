// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSelected)
 */
@JsUnion
sealed /* union */
external interface AriaSelected

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSelected#false)
 */
inline val AriaSelected.Companion.`false`: AriaSelected
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSelected#true)
 */
inline val AriaSelected.Companion.`true`: AriaSelected
    get() = unsafeCast("true")
