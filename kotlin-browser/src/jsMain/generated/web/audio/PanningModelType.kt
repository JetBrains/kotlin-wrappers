// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PanningModelType {
    companion object {
        @JsValue("HRTF")
        val HRTF: PanningModelType

        @JsValue("equalpower")
        val equalpower: PanningModelType
    }
}
