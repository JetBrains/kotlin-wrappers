// Automatically generated - do not modify!

package typescript

sealed external interface IdentifierTypePredicate : TypePredicateBase, TypePredicate {
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var kind: TypePredicateKind.Identifier
    var parameterName: String
    var parameterIndex: Double

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var type: Type
}
