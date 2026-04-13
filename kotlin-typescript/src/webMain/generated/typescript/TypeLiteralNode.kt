// Automatically generated - do not modify!

package typescript

external interface TypeLiteralNode :
    TypeNode,
    Declaration,
    PropertySignatureParent,
    MethodSignatureParent,
    GetAccessorDeclarationParent,
    SetAccessorDeclarationParent,
    ObjectTypeDeclaration {
    override val kind: SyntaxKind.TypeLiteral
    val members: NodeArray<TypeElement>
}
