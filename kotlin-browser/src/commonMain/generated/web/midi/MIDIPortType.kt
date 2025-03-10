// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.midi

import seskar.js.JsValue

sealed external interface MIDIPortType {
    companion object {
        @JsValue("input")
        val input: MIDIPortType

        @JsValue("output")
        val output: MIDIPortType
    }
}
