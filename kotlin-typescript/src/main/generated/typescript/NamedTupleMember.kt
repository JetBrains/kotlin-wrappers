// Automatically generated - do not modify!

package typescript

external interface NamedTupleMember : TypeNode, JSDocContainer, Declaration {
    override val kind: SyntaxKind.NamedTupleMember
    val dotDotDotToken: Token<SyntaxKind.DotDotDotToken>?
    val name: Identifier
    val questionToken: Token<SyntaxKind.QuestionToken>?
    val type: TypeNode
}
