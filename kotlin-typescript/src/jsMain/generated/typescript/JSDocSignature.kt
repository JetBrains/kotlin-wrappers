// Automatically generated - do not modify!

package typescript

sealed external interface JSDocSignature : JSDocType, Declaration, JSDocContainer, LocalsContainer, HasJSDoc,
    DeclarationWithTypeParameters, SignatureDeclarationField {
    override val kind: SyntaxKind.JSDocSignature
    val typeParameters: (js.array.ReadonlyArray<JSDocTemplateTag>)?
    val parameters: js.array.ReadonlyArray<JSDocParameterTag>
    val type: JSDocReturnTag?
}
