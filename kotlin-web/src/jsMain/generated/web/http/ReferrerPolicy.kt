// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
