// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaModal)
 */
@JsUnion
sealed /* union */
external interface AriaModal

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaModal#false)
 */
inline val AriaModal.Companion.`false`: AriaModal
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaModal#true)
 */
inline val AriaModal.Companion.`true`: AriaModal
    get() = unsafeCast("true")
