// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
