// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fonts

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FontFaceSetLoadStatus {
    companion object {
        @JsValue("loaded")
        val loaded: FontFaceSetLoadStatus

        @JsValue("loading")
        val loading: FontFaceSetLoadStatus
    }
}
