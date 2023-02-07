// Automatically generated - do not modify!

package typescript

sealed external interface EnumMember : NamedDeclaration, JSDocContainer, Union.EnumMember_ {
    override val kind: SyntaxKind.EnumMember
    override val parent: EnumDeclaration
    override val name: PropertyName
    val initializer: Expression?
}
