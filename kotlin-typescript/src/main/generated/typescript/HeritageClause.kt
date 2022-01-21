// Automatically generated - do not modify!

package typescript

external interface HeritageClause : Node {
    override val kind: SyntaxKind.HeritageClause
    override val parent: dynamic /* InterfaceDeclaration | ClassLikeDeclaration */
    val token: dynamic /* SyntaxKind.ExtendsKeyword | SyntaxKind.ImplementsKeyword */
    val types: NodeArray<ExpressionWithTypeArguments>
}
