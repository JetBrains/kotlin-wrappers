// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaOrientation)
 */
@JsUnion
sealed /* union */
external interface AriaOrientation

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaOrientation#horizontal)
 */
inline val AriaOrientation.Companion.horizontal: AriaOrientation
    get() = unsafeCast("horizontal")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaOrientation#vertical)
 */
inline val AriaOrientation.Companion.vertical: AriaOrientation
    get() = unsafeCast("vertical")
