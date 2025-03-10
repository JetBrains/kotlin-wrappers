// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.audio

import seskar.js.JsValue

sealed external interface OscillatorType {
    companion object {
        @JsValue("custom")
        val custom: OscillatorType

        @JsValue("sawtooth")
        val sawtooth: OscillatorType

        @JsValue("sine")
        val sine: OscillatorType

        @JsValue("square")
        val square: OscillatorType

        @JsValue("triangle")
        val triangle: OscillatorType
    }
}
