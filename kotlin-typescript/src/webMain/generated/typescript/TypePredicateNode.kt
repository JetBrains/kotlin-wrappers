// Automatically generated - do not modify!

package typescript

external interface TypePredicateNode :
    TypeNode,
    HasType {
    override val kind: SyntaxKind.TypePredicate
    override val parent: TypePredicateNodeParent
    val assertsModifier: AssertsKeyword?
    val parameterName: TypePredicateNodeParameterName
    val type: TypeNode?
}
