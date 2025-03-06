// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.core.JsAny
import seskar.js.JsValue

sealed external interface LDMLPluralRule :
    JsAny {

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
