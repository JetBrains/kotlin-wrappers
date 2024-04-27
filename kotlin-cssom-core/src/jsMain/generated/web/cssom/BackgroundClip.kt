// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BackgroundClip {
    companion object {
        @JsValue("border-box")
        val borderBox: BackgroundClip

        @JsValue("content-box")
        val contentBox: BackgroundClip

        @JsValue("padding-box")
        val paddingBox: BackgroundClip
    }
}
