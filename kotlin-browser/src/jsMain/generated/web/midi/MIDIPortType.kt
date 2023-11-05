// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.midi

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MIDIPortType {
    companion object {
        @JsValue("input")
        val input: MIDIPortType

        @JsValue("output")
        val output: MIDIPortType
    }
}
