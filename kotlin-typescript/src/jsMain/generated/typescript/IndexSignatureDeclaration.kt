// Automatically generated - do not modify!

package typescript

sealed external interface IndexSignatureDeclaration : SignatureDeclarationBase, ClassElement, TypeElement,
    LocalsContainer, HasJSDoc, HasModifiers, SignatureDeclaration {
    override val kind: SyntaxKind.IndexSignature
    override val parent: ObjectTypeDeclaration
    val modifiers: NodeArray<ModifierLike>?
    override val type: TypeNode
}
