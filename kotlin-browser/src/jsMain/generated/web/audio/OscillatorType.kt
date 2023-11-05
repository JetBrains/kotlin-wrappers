// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
