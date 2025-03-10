// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.http

import seskar.js.JsValue

sealed external interface RequestMode {
    companion object {
        @JsValue("cors")
        val cors: RequestMode

        @JsValue("navigate")
        val navigate: RequestMode

        @JsValue("no-cors")
        val noCors: RequestMode

        @JsValue("same-origin")
        val sameOrigin: RequestMode
    }
}
