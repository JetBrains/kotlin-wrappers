// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.audio

import seskar.js.JsValue

sealed external interface PanningModelType {
    companion object {
        @JsValue("HRTF")
        val HRTF: PanningModelType

        @JsValue("equalpower")
        val equalpower: PanningModelType
    }
}
