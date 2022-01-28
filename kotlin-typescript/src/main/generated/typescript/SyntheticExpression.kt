// Automatically generated - do not modify!

package typescript

sealed external interface SyntheticExpression : Expression {
    override val kind: SyntaxKind.SyntheticExpression
    val isSpread: Boolean
    val type: Type
    val tupleNameSource: dynamic /* ParameterDeclaration | NamedTupleMember */
}
