// Automatically generated - do not modify!

package web.history

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ScrollRestoration

inline val ScrollRestoration.Companion.auto: ScrollRestoration
    get() = unsafeCast("auto")

inline val ScrollRestoration.Companion.manual: ScrollRestoration
    get() = unsafeCast("manual")
