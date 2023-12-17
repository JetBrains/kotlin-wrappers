// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TypePredicateKind {
    companion object {
        @JsIntValue(0)
        val This: This

        @JsIntValue(1)
        val Identifier: Identifier

        @JsIntValue(2)
        val AssertsThis: AssertsThis

        @JsIntValue(3)
        val AssertsIdentifier: AssertsIdentifier
    }

    sealed interface This : TypePredicateKind
    sealed interface Identifier : TypePredicateKind
    sealed interface AssertsThis : TypePredicateKind
    sealed interface AssertsIdentifier : TypePredicateKind
}
