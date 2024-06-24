// Automatically generated - do not modify!

package typescript

sealed external interface KeywordTypeNode<TKind : KeywordTypeSyntaxKind /* default is KeywordTypeSyntaxKind */> :
    KeywordToken<TKind>, TypeNode {
    override val kind: TKind
}
