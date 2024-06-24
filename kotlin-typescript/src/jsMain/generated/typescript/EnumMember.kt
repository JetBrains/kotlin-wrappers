// Automatically generated - do not modify!

package typescript

sealed external interface EnumMember : NamedDeclaration, JSDocContainer, HasJSDoc, HasExpressionInitializer,
    VariableLikeDeclaration {
    override val kind: SyntaxKind.EnumMember
    override val parent: EnumDeclaration
    override val name: PropertyName
    val initializer: Expression?
}
