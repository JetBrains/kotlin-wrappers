// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PluralRuleType {
    companion object {
        @JsValue("cardinal")
        val cardinal: PluralRuleType

        @JsValue("ordinal")
        val ordinal: PluralRuleType
    }
}
