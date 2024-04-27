// Automatically generated - do not modify!

package web.fonts

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
