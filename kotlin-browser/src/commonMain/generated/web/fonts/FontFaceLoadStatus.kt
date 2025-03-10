// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.fonts

import seskar.js.JsValue

sealed external interface FontFaceLoadStatus {
    companion object {
        @JsValue("error")
        val error: FontFaceLoadStatus

        @JsValue("loaded")
        val loaded: FontFaceLoadStatus

        @JsValue("loading")
        val loading: FontFaceLoadStatus

        @JsValue("unloaded")
        val unloaded: FontFaceLoadStatus
    }
}
