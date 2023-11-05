// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PrefersContrast {
    companion object {
        @JsValue("no-preference")
        val noPreference: PrefersContrast

        @JsValue("more")
        val more: PrefersContrast

        @JsValue("less")
        val less: PrefersContrast

        @JsValue("custom")
        val custom: PrefersContrast
    }
}
