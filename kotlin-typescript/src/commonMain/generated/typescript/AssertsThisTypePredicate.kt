// Automatically generated - do not modify!

package typescript

sealed external interface AssertsThisTypePredicate :
    TypePredicateBase,
    TypePredicate {
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var kind: TypePredicateKind.AssertsThis
    var parameterName: Nothing?
    var parameterIndex: Nothing?

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var type: Type?
}
