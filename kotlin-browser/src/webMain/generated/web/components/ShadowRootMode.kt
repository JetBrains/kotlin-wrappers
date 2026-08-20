// Automatically generated - do not modify!

package web.components

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode)
 */
@JsUnion
sealed /* union */
external interface ShadowRootMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode#closed)
 */
inline val ShadowRootMode.Companion.closed: ShadowRootMode
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode#open)
 */
inline val ShadowRootMode.Companion.open: ShadowRootMode
    get() = unsafeCast("open")
