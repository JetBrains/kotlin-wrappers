// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect)
 */
@JsUnion
sealed /* union */
external interface RequestRedirect

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect#error)
 */
inline val RequestRedirect.Companion.error: RequestRedirect
    get() = unsafeCast("error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect#follow)
 */
inline val RequestRedirect.Companion.follow: RequestRedirect
    get() = unsafeCast("follow")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect#manual)
 */
inline val RequestRedirect.Companion.manual: RequestRedirect
    get() = unsafeCast("manual")
