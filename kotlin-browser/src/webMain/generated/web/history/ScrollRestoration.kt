// Automatically generated - do not modify!

package web.history

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/scrollRestoration)
 */
@JsUnion
sealed /* union */
external interface ScrollRestoration

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/scrollRestoration#auto)
 */
inline val ScrollRestoration.Companion.auto: ScrollRestoration
    get() = unsafeCast("auto")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/scrollRestoration#manual)
 */
inline val ScrollRestoration.Companion.manual: ScrollRestoration
    get() = unsafeCast("manual")
