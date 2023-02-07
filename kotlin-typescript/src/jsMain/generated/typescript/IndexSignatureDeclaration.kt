// Automatically generated - do not modify!

package typescript

sealed external interface IndexSignatureDeclaration : SignatureDeclarationBase, ClassElement, TypeElement,
    Union.IndexSignatureDeclaration_ {
    override val kind: SyntaxKind.IndexSignature
    override val parent: ObjectTypeDeclaration
    val modifiers: NodeArray<Modifier>?
    override val type: TypeNode
}
