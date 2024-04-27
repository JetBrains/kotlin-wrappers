// Automatically generated - do not modify!

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
