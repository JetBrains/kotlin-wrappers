// Automatically generated - do not modify!

package typescript.ast

external interface EnumDeclaration :
    DeclarationStatement,
    JSDocContainer,
    HasJSDoc,
    HasModifiers {
    override val kind: SyntaxKind.EnumDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val name: Identifier
    val members: NodeArray<EnumMember>
}
