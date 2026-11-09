// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPressed)
 */
@JsUnion
sealed /* union */
external interface AriaPressed

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPressed#false)
 */
inline val AriaPressed.Companion.`false`: AriaPressed
    get() = unsafeCast("false")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPressed#mixed)
 */
inline val AriaPressed.Companion.mixed: AriaPressed
    get() = unsafeCast("mixed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPressed#true)
 */
inline val AriaPressed.Companion.`true`: AriaPressed
    get() = unsafeCast("true")
