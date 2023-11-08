// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Resize {
    companion object {
        @JsValue("block")
        val block: Resize

        @JsValue("both")
        val both: Resize

        @JsValue("horizontal")
        val horizontal: Resize

        @JsValue("inline")
        val inline: Resize

        @JsValue("vertical")
        val vertical: Resize
    }
}
