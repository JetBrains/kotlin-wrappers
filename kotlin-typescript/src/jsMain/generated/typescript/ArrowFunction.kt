// Automatically generated - do not modify!

package typescript

sealed external interface ArrowFunction : Expression, FunctionLikeDeclarationBase, JSDocContainer,
    Union.ArrowFunction_ {
    override val kind: SyntaxKind.ArrowFunction
    val modifiers: NodeArray<Modifier>?
    val equalsGreaterThanToken: EqualsGreaterThanToken
    override val body: ConciseBody
    override val name: Nothing
}
