// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface QuotePreference {
    companion object {
        @JsValue("auto")
        val auto: QuotePreference

        @JsValue("double")
        val double: QuotePreference

        @JsValue("single")
        val single: QuotePreference
    }
}
