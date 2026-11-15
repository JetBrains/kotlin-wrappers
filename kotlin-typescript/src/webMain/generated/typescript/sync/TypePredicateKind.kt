// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript.sync

/* enum */
@SubclassOptInRequired(js.internal.InternalApi::class)
external interface TypePredicateKind {
    sealed interface This : TypePredicateKind

    sealed interface Identifier : TypePredicateKind

    sealed interface AssertsThis : TypePredicateKind

    sealed interface AssertsIdentifier : TypePredicateKind

    companion object {
        val This: This
        val Identifier: Identifier
        val AssertsThis: AssertsThis
        val AssertsIdentifier: AssertsIdentifier
    }
}
