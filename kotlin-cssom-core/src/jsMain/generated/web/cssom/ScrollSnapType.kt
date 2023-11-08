// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ScrollSnapType {
    companion object {
        @JsValue("block")
        val block: ScrollSnapType

        @JsValue("both")
        val both: ScrollSnapType

        @JsValue("inline")
        val inline: ScrollSnapType

        @JsValue("x")
        val x: ScrollSnapType

        @JsValue("y")
        val y: ScrollSnapType
    }
}
