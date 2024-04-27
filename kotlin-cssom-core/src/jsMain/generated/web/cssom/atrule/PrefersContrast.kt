// Automatically generated - do not modify!

package web.cssom.atrule

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
