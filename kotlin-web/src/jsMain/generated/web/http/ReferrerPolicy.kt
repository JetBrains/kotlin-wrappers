// Automatically generated - do not modify!

package web.http

import seskar.js.JsValue

sealed external interface ReferrerPolicy {
    companion object {
        @JsValue("")
        val none: ReferrerPolicy

        @JsValue("no-referrer")
        val noReferrer: ReferrerPolicy

        @JsValue("no-referrer-when-downgrade")
        val noReferrerWhenDowngrade: ReferrerPolicy

        @JsValue("origin")
        val origin: ReferrerPolicy

        @JsValue("origin-when-cross-origin")
        val originWhenCrossOrigin: ReferrerPolicy

        @JsValue("same-origin")
        val sameOrigin: ReferrerPolicy

        @JsValue("strict-origin")
        val strictOrigin: ReferrerPolicy

        @JsValue("strict-origin-when-cross-origin")
        val strictOriginWhenCrossOrigin: ReferrerPolicy

        @JsValue("unsafe-url")
        val unsafeUrl: ReferrerPolicy
    }
}
