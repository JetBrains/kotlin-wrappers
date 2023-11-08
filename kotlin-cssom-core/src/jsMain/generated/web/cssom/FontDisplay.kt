// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FontDisplay {
    companion object {
        @JsValue("block")
        val block: FontDisplay

        @JsValue("fallback")
        val fallback: FontDisplay

        @JsValue("optional")
        val optional: FontDisplay

        @JsValue("swap")
        val swap: FontDisplay
    }
}
