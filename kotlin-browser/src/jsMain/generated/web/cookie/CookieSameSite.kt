// Automatically generated - do not modify!

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
