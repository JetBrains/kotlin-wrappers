// Automatically generated - do not modify!

package web.cookie

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CookieSameSite

inline val CookieSameSite.Companion.lax: CookieSameSite
    get() = unsafeCast("lax")

inline val CookieSameSite.Companion.none: CookieSameSite
    get() = unsafeCast("none")

inline val CookieSameSite.Companion.strict: CookieSameSite
    get() = unsafeCast("strict")
