// Automatically generated - do not modify!

package typescript

external interface TypePredicateNode : TypeNode {
    override val kind: SyntaxKind.TypePredicate
    override val parent: dynamic /* SignatureDeclaration | JSDocTypeExpression */
    val assertsModifier: AssertsKeyword?
    val parameterName: dynamic /* Identifier | ThisTypeNode */
    val type: TypeNode?
}
