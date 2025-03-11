// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cookie

import seskar.js.JsValue

sealed external interface CookieSameSite {
    companion object {
        @JsValue("lax")
        val lax: CookieSameSite

        @JsValue("none")
        val none: CookieSameSite

        @JsValue("strict")
        val strict: CookieSameSite
    }
}
