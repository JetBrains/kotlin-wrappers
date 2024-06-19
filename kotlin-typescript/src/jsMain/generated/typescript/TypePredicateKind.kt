// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue

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
