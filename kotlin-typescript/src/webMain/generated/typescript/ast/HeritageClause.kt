// Automatically generated - do not modify!

package typescript.ast

external interface HeritageClause : Node {
    override val kind: SyntaxKind.HeritageClause
    override val parent: HeritageClauseParent?
    val token: HeritageClauseToken
    val types: NodeArray<ExpressionWithTypeArguments>
}
