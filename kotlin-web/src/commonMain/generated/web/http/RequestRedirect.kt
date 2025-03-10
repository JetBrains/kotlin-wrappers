// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.http

import seskar.js.JsValue

sealed external interface RequestRedirect {
    companion object {
        @JsValue("error")
        val error: RequestRedirect

        @JsValue("follow")
        val follow: RequestRedirect

        @JsValue("manual")
        val manual: RequestRedirect
    }
}
