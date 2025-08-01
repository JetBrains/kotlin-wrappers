// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cookie

import js.reflect.unsafeCast

sealed external interface CookieSameSite {
    companion object
}

inline val CookieSameSite.Companion.lax: CookieSameSite
    get() = unsafeCast("lax")

inline val CookieSameSite.Companion.none: CookieSameSite
    get() = unsafeCast("none")

inline val CookieSameSite.Companion.strict: CookieSameSite
    get() = unsafeCast("strict")
