// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface LDMLPluralRule {
    companion object {
        @JsValue("zero")
        val zero: LDMLPluralRule

        @JsValue("one")
        val one: LDMLPluralRule

        @JsValue("two")
        val two: LDMLPluralRule

        @JsValue("few")
        val few: LDMLPluralRule

        @JsValue("many")
        val many: LDMLPluralRule

        @JsValue("other")
        val other: LDMLPluralRule
    }
}
