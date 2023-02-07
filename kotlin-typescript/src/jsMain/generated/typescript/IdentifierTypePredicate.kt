// Automatically generated - do not modify!

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package typescript

sealed external interface IdentifierTypePredicate : TypePredicateBase, Union.IdentifierTypePredicate_ {
    override var kind: TypePredicateKind.Identifier
    var parameterName: String
    var parameterIndex: Int
    override var type: Type
}
