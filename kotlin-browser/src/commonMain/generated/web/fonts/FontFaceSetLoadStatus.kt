// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.fonts

import seskar.js.JsValue

sealed external interface FontFaceSetLoadStatus {
    companion object {
        @JsValue("loaded")
        val loaded: FontFaceSetLoadStatus

        @JsValue("loading")
        val loading: FontFaceSetLoadStatus
    }
}
