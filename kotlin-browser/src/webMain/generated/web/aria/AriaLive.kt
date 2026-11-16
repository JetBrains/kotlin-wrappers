// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLive)
 */
@JsUnion
sealed /* union */
external interface AriaLive

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLive#assertive)
 */
inline val AriaLive.Companion.assertive: AriaLive
    get() = unsafeCast("assertive")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLive#off)
 */
inline val AriaLive.Companion.off: AriaLive
    get() = unsafeCast("off")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLive#polite)
 */
inline val AriaLive.Companion.polite: AriaLive
    get() = unsafeCast("polite")
