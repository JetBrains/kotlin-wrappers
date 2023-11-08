// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface UnicodeBidi {
    companion object {
        @JsValue("bidi-override")
        val bidiOverride: UnicodeBidi

        @JsValue("embed")
        val embed: UnicodeBidi

        @JsValue("isolate")
        val isolate: UnicodeBidi

        @JsValue("isolate-override")
        val isolateOverride: UnicodeBidi

        @JsValue("normal")
        val normal: UnicodeBidi

        @JsValue("plaintext")
        val plaintext: UnicodeBidi
    }
}
