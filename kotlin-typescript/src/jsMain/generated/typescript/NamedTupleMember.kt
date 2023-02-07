// Automatically generated - do not modify!

package typescript

sealed external interface NamedTupleMember : TypeNode, JSDocContainer, Declaration, Union.NamedTupleMember_ {
    override val kind: SyntaxKind.NamedTupleMember
    val dotDotDotToken: Token<SyntaxKind.DotDotDotToken>?
    val name: Identifier
    val questionToken: Token<SyntaxKind.QuestionToken>?
    val type: TypeNode
}
