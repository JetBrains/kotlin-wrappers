// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.temporal

import seskar.js.JsValue

sealed external interface Disambiguation {
    companion object {
        @JsValue("compatible")
        val compatible: Disambiguation

        @JsValue("earlier")
        val earlier: Disambiguation

        @JsValue("later")
        val later: Disambiguation

        @JsValue("reject")
        val reject: Disambiguation
    }
}
