// Automatically generated - do not modify!

package web.audio

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PanningModelType {
    companion object {
        @JsValue("HRTF")
        val HRTF: PanningModelType

        @JsValue("equalpower")
        val equalpower: PanningModelType
    }
}
