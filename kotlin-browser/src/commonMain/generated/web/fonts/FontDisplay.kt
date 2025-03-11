// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fonts

import seskar.js.JsValue

sealed external interface FontDisplay {
    companion object {
        @JsValue("auto")
        val auto: FontDisplay

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
