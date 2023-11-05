// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Scripting {
    companion object {
        @JsValue("none")
        val none: Scripting

        @JsValue("initial-only")
        val initialOnly: Scripting

        @JsValue("enabled")
        val enabled: Scripting
    }
}
