// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRequired)
 */
@JsUnion
sealed /* union */
external interface AriaRequired

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRequired#false)
 */
inline val AriaRequired.Companion.`false`: AriaRequired
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRequired#true)
 */
inline val AriaRequired.Companion.`true`: AriaRequired
    get() = unsafeCast("true")
