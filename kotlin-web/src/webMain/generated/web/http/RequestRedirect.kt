// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface RequestRedirect

inline val RequestRedirect.Companion.error: RequestRedirect
    get() = unsafeCast("error")

inline val RequestRedirect.Companion.follow: RequestRedirect
    get() = unsafeCast("follow")

inline val RequestRedirect.Companion.manual: RequestRedirect
    get() = unsafeCast("manual")
