// Automatically generated - do not modify!

package typescript

sealed external interface TypePredicateNode : TypeNode, Union.TypePredicateNode_ {
    override val kind: SyntaxKind.TypePredicate
    override val parent: Union.TypePredicateNode_parent
    val assertsModifier: AssertsKeyword?
    val parameterName: Union.TypePredicateNode_parameterName
    val type: TypeNode?
}
