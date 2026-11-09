// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaReadOnly)
 */
@JsUnion
sealed /* union */
external interface AriaReadOnly

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaReadOnly#false)
 */
inline val AriaReadOnly.Companion.`false`: AriaReadOnly
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaReadOnly#true)
 */
inline val AriaReadOnly.Companion.`true`: AriaReadOnly
    get() = unsafeCast("true")
