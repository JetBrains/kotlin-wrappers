// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.audio

import seskar.js.JsValue

sealed external interface OverSampleType {
    companion object {
        @JsValue("2x")
        val x2: OverSampleType

        @JsValue("4x")
        val x4: OverSampleType

        @JsValue("none")
        val none: OverSampleType
    }
}
