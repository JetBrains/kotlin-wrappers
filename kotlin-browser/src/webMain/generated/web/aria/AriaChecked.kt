// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaChecked)
 */
@JsUnion
sealed /* union */
external interface AriaChecked

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaChecked#false)
 */
inline val AriaChecked.Companion.`false`: AriaChecked
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaChecked#mixed)
 */
inline val AriaChecked.Companion.mixed: AriaChecked
    get() = unsafeCast("mixed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaChecked#true)
 */
inline val AriaChecked.Companion.`true`: AriaChecked
    get() = unsafeCast("true")
