// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Sensitivity {
    companion object {
        @JsValue("base")
        val base: Sensitivity

        @JsValue("accent")
        val accent: Sensitivity

        @JsValue("case")
        val case: Sensitivity

        @JsValue("variant")
        val variant: Sensitivity
    }
}
