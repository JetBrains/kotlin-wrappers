// Automatically generated - do not modify!

package typescript

sealed external interface HeritageClause : Node {
    override val kind: SyntaxKind.HeritageClause
    override val parent: Union.HeritageClause_parent
    val token: Union.HeritageClause_token
    val types: NodeArray<ExpressionWithTypeArguments>
}
