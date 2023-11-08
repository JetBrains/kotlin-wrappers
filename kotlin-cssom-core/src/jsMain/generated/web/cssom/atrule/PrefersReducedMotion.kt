// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PrefersReducedMotion {
    companion object {
        @JsValue("no-preference")
        val noPreference: PrefersReducedMotion

        @JsValue("reduce")
        val reduce: PrefersReducedMotion
    }
}
