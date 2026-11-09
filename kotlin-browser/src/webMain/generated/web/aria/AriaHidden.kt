// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHidden)
 */
@JsUnion
sealed /* union */
external interface AriaHidden

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHidden#false)
 */
inline val AriaHidden.Companion.`false`: AriaHidden
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHidden#true)
 */
inline val AriaHidden.Companion.`true`: AriaHidden
    get() = unsafeCast("true")
