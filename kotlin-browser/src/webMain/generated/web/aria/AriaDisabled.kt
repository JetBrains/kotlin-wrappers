// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDisabled)
 */
@JsUnion
sealed /* union */
external interface AriaDisabled

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDisabled#false)
 */
inline val AriaDisabled.Companion.`false`: AriaDisabled
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDisabled#true)
 */
inline val AriaDisabled.Companion.`true`: AriaDisabled
    get() = unsafeCast("true")
