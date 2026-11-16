// Automatically generated - do not modify!

package typescript.ast

external interface JSDocTemplateTag :
    JSDocTag,
    DeclarationWithTypeParameterChildren {
    override val kind: SyntaxKind.JSDocTemplateTag
    val constraint: JSDocTypeExpression?
    val typeParameters: NodeArray<TypeParameterDeclaration>
}
