// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WhiteSpaceCollapse {
    companion object {
        @JsValue("break-spaces")
        val breakSpaces: WhiteSpaceCollapse

        @JsValue("collapse")
        val collapse: WhiteSpaceCollapse

        @JsValue("discard")
        val discard: WhiteSpaceCollapse

        @JsValue("preserve")
        val preserve: WhiteSpaceCollapse

        @JsValue("preserve-breaks")
        val preserveBreaks: WhiteSpaceCollapse

        @JsValue("preserve-spaces")
        val preserveSpaces: WhiteSpaceCollapse
    }
}
