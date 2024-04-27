// Automatically generated - do not modify!

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
